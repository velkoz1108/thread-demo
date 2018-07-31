package demo11.self;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 15:06
 *
 * 逻辑锁
 */

public class ReadWriteLock {
    private int readingReaders = 0; //实际正在读取中的线程个数
    private int waitingWriters = 0; //正在等待写入的线程个数
    private int writingWriters = 0; //实际正在写入中的线程个数
    private boolean preferWriter = true; // 若写入优先，则为true

    public synchronized void readLock() throws InterruptedException {
        while (writingWriters > 0 || preferWriter && waitingWriters > 0) {
            wait();
        }
        readingReaders++;  //实际正在读取的线程个数加1
    }

    public synchronized void readUnlock() {
        readingReaders--; //实际正在读取的线程个数减1
        preferWriter = true;
        notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException {
        waitingWriters++;  //正在等待写入的线程个数加1
        try {
            while (readingReaders > 0 || writingWriters > 0) {
                wait();
            }
        } finally {
            waitingWriters--; //正在等待写入的线程个数减1
        }
        writingWriters++;   //实际正在写入的线程个数加1
    }

    public synchronized void writeUnlock() {
        writingWriters--;   //实际正在写入的线程个数减1
        preferWriter = false;
        notifyAll();
    }
}
