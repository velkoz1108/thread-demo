package demo19;

/**
 * @author : wangtao
 * @date : 2018/8/16 19:13  星期四
 */


public interface ActiveObject {
    public abstract Result<String> makeString(int count, char fillchar);

    public abstract void displayString(String string);
}
