package demo19;

/**
 * @author : wangtao
 * @date : 2018/8/16 19:31  星期四
 */


public class RealResult<T> extends Result<T> {
    private final T resultValue;

    public RealResult(T resultValue) {
        this.resultValue = resultValue;
    }

    @Override
    public T getResultValue() {
        return resultValue;
    }
}
