package demo12.scheduled;

import org.omg.CORBA.TIMEOUT;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 16:43
 */

public class Host {
    private final Helper helper = new Helper();
    private final ScheduledExecutorService scheduledExecutorService;

    public Host(ScheduledExecutorService scheduledExecutorService) {
        this.scheduledExecutorService = scheduledExecutorService;
    }

    public void request(final int count, final char c) {
        System.out.println("    request (" + count + ", " + c + " ) Begin ... ");
        scheduledExecutorService.schedule(new Runnable() {
                                              public void run() {
                                                  helper.handle(count, c);
                                              }
                                          },
                3L,
                TimeUnit.SECONDS
        );
        System.out.println("    request (" + count + ", " + c + " ) End ... ");
    }
}
