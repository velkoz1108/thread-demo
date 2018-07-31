package demo12.scheduled;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 16:29
 */

public class Demo {
    public static void main(String[] args) {
        System.out.println("main begin ");
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        Host host = new Host(executorService);
        try {
            host.request(10, 'A');
            host.request(20, 'B');
            host.request(30, 'C');
        } finally {
            executorService.shutdown();
        }

        System.out.println("main end ");
    }
}
