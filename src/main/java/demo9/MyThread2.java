package demo9;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 9:21
 */

public class MyThread2 extends Thread {

    //调用wait方法需要获取对象锁  join 和 sleep 则不需要
    @Override
    public synchronized void run() {
        System.out.println(" start ... " );
        try {
            this.wait();
            System.out.println(" after wait ... " );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" end ... " );
    }
}
