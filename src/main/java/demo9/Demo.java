package demo9;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 9:20
 */

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(2000);
        myThread.interrupt();
    }

}
