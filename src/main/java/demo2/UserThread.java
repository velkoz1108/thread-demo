package demo2;

import java.util.Random;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/24 14:51
 */

public class UserThread extends Thread {
    private final static Random RANDOM = new Random(26535);
    private final BoundedResource resource;


    public UserThread(BoundedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {

        try {
            while (true) {
                resource.use();
                Thread.sleep(RANDOM.nextInt(3000));
            }
        } catch (InterruptedException e) {


        }
    }
}
