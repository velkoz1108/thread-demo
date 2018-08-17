package demo19;

/**
 * @author : wangtao
 * @date : 2018/8/16 19:42  星期四
 */


public abstract class MethodRequest<T> {
    protected final Servant servant;
    protected final FutureResult<T> future;

    public MethodRequest(Servant servant, FutureResult<T> future) {
        this.servant = servant;
        this.future = future;
    }

    public abstract void execute();
}
