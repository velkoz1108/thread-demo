package demo4.right;

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
        /**通过Collections.synchronizedList方法同步ArrayList实例 */
        final List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
        /**写线程显示调用add和remove方法*/
        new WriterThread(list).start();
        /**读线程隐式调用迭代器，故需要synchronized代码块同步*/
        new ReadThread(list).start();
    }
}
