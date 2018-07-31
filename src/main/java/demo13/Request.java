package demo13;

import java.util.Random;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 17:28
 */

public class Request {
    private final String name;
    private final int number;
    private static final Random RANDOM = new Random();

    public Request(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "[Request from " + name + " No." + number + "]";
    }

    public void execute() {
        System.out.println(Thread.currentThread().getName() + " executes " + this);
        try {
            Thread.sleep(RANDOM.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
