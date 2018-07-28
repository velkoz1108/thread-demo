package demo8;

import java.util.Random;

/**
 * @author : want
 * @Team Home
 * @date : 2018-7-28 14:04 星期六
 */
public class MakerThread extends Thread {
    private final Random random;
    private final Table table;
    private static int id = 0; //蛋糕的流水号，所有糕点师共用

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(1000));
                String cake = "[ Cake No." + nextId() + " by " + getName() + "]";
                table.put(cake);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static synchronized int nextId() {
        return id++;
    }

    public MakerThread(String name, Table table, long seed) {
        super(name);
        this.random = new Random(seed);
        this.table = table;
    }
}
