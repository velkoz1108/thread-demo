package demo12.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 16:43
 */

public class Host {
    private final Helper helper = new Helper();
    private final Executor executor;

    public Host(ExecutorService executorService) {
        this.executor = executorService;
    }

    public void request(final int count, final char c) {
        System.out.println("    request (" + count + ", " + c + " ) Begin ... ");
        executor.execute(new Runnable() {
            public void run() {
                helper.handle(count, c);
            }
        });
        System.out.println("    request (" + count + ", " + c + " ) End ... ");
    }
}
