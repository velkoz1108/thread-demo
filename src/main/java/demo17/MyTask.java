package demo17;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/9 20:40
 */

public class MyTask implements Runnable {
    private static final int PHASE = 5;
    private final CyclicBarrier phaseBarrier;
    private final CountDownLatch downLatch;
    private final int context;
    private static final Random RANDOM = new Random(12321);

    public MyTask(CyclicBarrier phaseBarrier, CountDownLatch downLatch, int context) {
        this.phaseBarrier = phaseBarrier;
        this.downLatch = downLatch;
        this.context = context;
    }

    @Override
    public void run() {
        try {
            for (int phase = 0;phase<PHASE;phase++){
                doPhase(phase);
                phaseBarrier.await();
            }
        } catch (InterruptedException e) {
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }finally {
            downLatch.countDown();
        }
    }

    private void doPhase(int phase) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ":MyThread begin context :"+context+", phase = "+phase);
        try {
            Thread.sleep(RANDOM.nextInt(3000));
        } catch (InterruptedException e) {
        }finally {
            System.out.println(name + ":MyThread end context :"+context+", phase = "+phase);
        }
    }
}
