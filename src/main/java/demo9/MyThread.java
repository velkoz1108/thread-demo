package demo9;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 9:21
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(" start ... " );
        try {
            Thread.sleep(604800000);
            System.out.println(" after sleep ... ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" end ... " );
    }
}
