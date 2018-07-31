package demo13;

import java.util.Random;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 17:28
 */

public class ClientThread extends Thread {
    private final Channel channel;
    private static final Random RANDOM = new Random();

    public ClientThread(String name, Channel channel) {
        super(name);
        this.channel = channel;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; true; i++) {
                Request request = new Request(getName(), i);
                channel.putRequest(request);
                Thread.sleep(RANDOM.nextInt(1000));
            }
        } catch (InterruptedException e) {

        }
    }
}
