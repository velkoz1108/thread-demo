package demo20;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author : want
 * @Team Home
 * @date : 2018-8-26 9:25 星期日
 */
public class ActiveObjectImpl implements ActiveObject {
    private final ExecutorService service = Executors.newSingleThreadExecutor();

    @Override
    public Future<String> makeString(int count, char fillchar) {

        //请求
        class MakeStringRequest implements Callable<String> {
            @Override
            public String call() throws Exception {
                char[] buffer = new char[count];
                for (int i = 0; i < count; i++) {
                    buffer[i] = fillchar;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
                return new String(buffer);
            }
        }

        //发出请求
        return service.submit(new MakeStringRequest());
    }

    @Override
    public void displayString(String string) {

        //请求
        class DisplayStringRequest implements Runnable {

            @Override
            public void run() {
                try {
                    System.out.println("displayString : " + string);
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
            }
        }

        //发出请求
        service.execute(new DisplayStringRequest());
    }

    @Override
    public void shutdown() {
        service.shutdown();
    }
}
