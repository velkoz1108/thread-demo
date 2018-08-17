package demo19;

/**
 * @author : wangtao
 * @date : 2018/8/16 19:33  星期四
 */


public class FutureResult<T> extends Result<T> {

    private Result<T> result;

    private boolean ready = false;

    public synchronized void setResult(Result<T> result) {
        this.result = result;
        this.ready = true;
        notifyAll();
    }

    @Override
    public synchronized T getResultValue() {
        while (!ready) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        return result.getResultValue();
    }
}
