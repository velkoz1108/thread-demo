package demo2;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/24 14:38
 */

public class BoundedResource {
    private final Semaphore semaphore;
    private final int permits;
    private final static Random randem = new Random(314159);

    //构造函数（permits为资源个数）
    public BoundedResource(int permits) {
        this.semaphore = new Semaphore(permits);
        this.permits = permits;
    }

    //使用资源
    public void use() throws InterruptedException {
        semaphore.acquire();
        try {
            doUse();
        } finally {
            semaphore.release();
        }

    }

    //实际使用资源
    private void doUse() throws InterruptedException {
        Log.println(" 【start】 : used = " + (permits - semaphore.availablePermits()));
        Thread.sleep(500);
        Log.println(" [end] : used = " + (permits - semaphore.availablePermits()));

    }
}
