package demo4.right2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/26 11:28
 */

public class Demo {
    public static void main(String[] args) {
        /**CopyOnWriteArrayList */
        final List<Integer> list = new CopyOnWriteArrayList<Integer>();
        new WriterThread(list).start();
        new ReadThread(list).start();
    }
}
