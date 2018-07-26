package demo4.right2;

import java.util.List;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/26 11:34
 */

public class ReadThread extends Thread {
    private final List<Integer> list;

    public ReadThread(List<Integer> list) {
        super("ReadThread");
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            for (Integer integer : list) {
                System.out.println(integer);

            }
        }
    }
}
