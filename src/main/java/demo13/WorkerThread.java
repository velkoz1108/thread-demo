package demo13;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 17:28
 */

public class WorkerThread extends Thread {
    private final Channel channel;

    @Override
    public void run() {
        while (true) {
            Request request = channel.takeRequest();
            request.execute();
        }
    }

    public WorkerThread(String name, Channel channel) {
        super(name);
        this.channel = channel;
    }
}
