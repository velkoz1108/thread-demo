package demo11.office;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 15:06
 */

public class ReaderThread extends Thread {
    private final Data data ;

    @Override
    public void run() {
        try {
            while (true){
                char[] readbuf = data.read();
                System.out.println(Thread.currentThread().getName()+" reads "+String.valueOf(readbuf));
            }
        } catch (InterruptedException e) {

        }
    }

    public ReaderThread(Data data) {
        this.data = data;
    }
}
