package demo22;

/**
 * @author : want
 * @Team Home
 * @date : 2018-8-26 19:44 星期日
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();

        //启动线程
        myThread.start();

        //主线程中调用方法
        Thread.sleep(1000);
        myThread.shutdown();
    }
}
