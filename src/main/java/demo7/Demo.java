package demo7;

import java.util.concurrent.TimeoutException;

/**
 * @author : want
 * @Team Home
 * @date : 2018-7-28 10:44 星期六
 */
public class Demo {
    public static void main(String[] args) {
        Host host = new Host(10000);
        try {
            System.out.println("execute begin ... ");
            host.execute();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
