package demo15;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/6 11:27
 */

public class CountupThread extends Thread {

    private long counter = 0;

    //发出终止请求后变为true
    private volatile boolean shutdownRequested = false;

    //终止请求
    public void shutdownRequest() {
        shutdownRequested = true;
        interrupt();
    }

    //检查是否发出了终止请求
    public boolean isShutdownRequested() {
        return shutdownRequested;
    }

    //线程体
    @Override
    public final void run() {
        try {
            while (!isShutdownRequested()) {
                doWork();
            }
        } catch (InterruptedException e) {

        } finally {
            doShutdown();
        }
    }

    private void doShutdown() {
        System.out.println("doShutdown: counter = " + counter);
    }

    private void doWork() throws InterruptedException {
        counter++;
        System.out.println("doWork: counter = " + counter);
        Thread.sleep(500);
    }
}
