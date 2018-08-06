package demo14;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/2 16:03
 */

public class FutureData2 extends FutureTask<RealData> implements Data {
    public FutureData2(Callable<RealData> callable) {
        super(callable);
    }

    @Override
    public String getContent() {
        String s = null;
        try {
            s = get().getContent();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return s;
    }
}
