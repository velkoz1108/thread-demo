package demo22;

/**
 * @author : want
 * @Team Home
 * @date : 2018-8-26 19:44 星期日
 */
public class MyThread extends Thread {
    // volatile 同步
    private boolean quit = false;

    @Override
    public void run() {
        while (!quit) {
            System.out.println("waiting ... ");
        }
        System.out.println("Done");
    }


    public void shutdown() {
        System.out.println("shutdown ... ");
        quit = true;
    }
}
