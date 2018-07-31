package demo11.office;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 15:05
 */

public class Demo {
    public static void main(String[] args) {
        Data data = new Data(10);
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new WriterThread(data,"ABCDEFGHIJKLMNOPQRSTUVWXYZ").start();
        new WriterThread(data,"abcdefghijklmnopqrstuvwxyz").start();
    }
}
