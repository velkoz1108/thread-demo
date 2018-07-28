package demo8;

import java.util.Random;

/**
 * @author : want
 * @Team Home
 * @date : 2018-7-28 14:04 星期六
 */
public class EaterThread extends Thread {
    private final Random random;
    private final Table table;

    @Override
    public void run() {

        try {
            while (true){
                String cake = table.take();
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
        }
    }

    public EaterThread(String name, Table table, long seed) {
        super(name);
        this.random = new Random(seed);
        this.table = table;
    }
}
