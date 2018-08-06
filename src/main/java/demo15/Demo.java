package demo15;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/6 11:26
 */

public class Demo {
    public static void main(String[] args) {
        System.out.println("main: Begin");
        try {
            CountupThread t = new CountupThread();
            t.start();

            Thread.sleep(10000);

            System.out.println("main: shutdownRequest");
            t.shutdownRequest();

            System.out.println("main: join");

            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main: end");
    }
}
