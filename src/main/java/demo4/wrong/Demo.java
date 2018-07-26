package demo4.wrong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/26 11:28
 */

public class Demo {
    public static void main(String[] args) {
        /**非线程安全 Exception in thread "ReadThread" java.util.ConcurrentModificationException*/
        List<Integer> list = new ArrayList<Integer>();
        new WriterThread(list).start();
        new ReadThread(list).start();
    }
}
