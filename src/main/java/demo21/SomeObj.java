package demo21;

/**
 * @author : want
 * @Team Home
 * @date : 2018-8-26 19:34 星期日
 */
public class SomeObj {
    private int x = 0;
    private int y = 0;

    //加 synchronized 关键字 同步
    public void write() {
        x = 100;
        y = 50;
    }
    //加 synchronized 关键字 同步
    public void read() {
        if (x < y) {
            System.out.println("x < y");
        }
    }
}
