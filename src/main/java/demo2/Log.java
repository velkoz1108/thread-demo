package demo2;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/24 14:36
 */

public class Log {
    public static void println(String s) {
        System.out.println(Thread.currentThread().getName()+", s : " + s);
    }
}
