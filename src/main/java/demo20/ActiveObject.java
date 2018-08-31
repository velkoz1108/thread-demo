package demo20;

import java.util.concurrent.Future;

/**
 * @author : wangtao
 * @date : 2018/8/16 19:13  星期四
 */


public interface ActiveObject {
    public abstract Future<String> makeString(int count, char fillchar);

    public abstract void displayString(String string);

    public abstract void shutdown();
}
