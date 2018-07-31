package demo9;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 9:28
 */

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 thread2 = new MyThread2();
        thread2.start();
        Thread.sleep(3000);
        System.out.println(thread2.isInterrupted());
        thread2.interrupt();
        System.out.println(thread2.isInterrupted());

    }
}
