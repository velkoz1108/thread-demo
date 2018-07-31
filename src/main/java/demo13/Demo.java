package demo13;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 17:27
 */

public class Demo {
    public static void main(String[] args) {
        Channel channel = new Channel(5);
        channel.startWorkers();
        new ClientThread("Alice",channel).start();
        new ClientThread("Bobby",channel).start();
        new ClientThread("Chris",channel).start();
    }
}
