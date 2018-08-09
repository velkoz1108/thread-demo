package demo17;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/9 20:33
 */

public class Demo {

    //线程的个数
    private static final int THREADS = 3;

    public static void main(String[] args) {
        System.out.println("Begin");
        //由ExecutorService提供进行工作的线程
        ExecutorService service = Executors.newFixedThreadPool(THREADS);

        //屏障被解除时的操作
        Runnable barrierAction = new Runnable() {
            @Override
            public void run() {
                System.out.println(" Barrier Action !");
            }
        };

        //CyclicBarrier 用于使线程步调一致
        CyclicBarrier phaseBarrier = new CyclicBarrier(THREADS, barrierAction);

        //CountDownLatch用于确认工作是否结束
        CountDownLatch downLatch = new CountDownLatch(THREADS);

        try {
            for (int t = 0; t < THREADS; t++) {
                service.execute(new MyTask(phaseBarrier, downLatch, t));
            }
            //等待工作结束
            System.out.println("Await ");
            downLatch.await();
        } catch (InterruptedException e) {
        } finally {
            service.shutdown();
            System.out.println("end");
        }
    }
}
