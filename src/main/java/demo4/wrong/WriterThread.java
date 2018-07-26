package demo4.wrong;

import java.util.List;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/26 11:30
 */

public class WriterThread extends Thread {
    private final List<Integer> list;

    public WriterThread(List<Integer> list) {
        super("WriterThread");
        this.list = list;
    }

    @Override
    public void run() {
       for(int i= 0;true;i++){
           list.add(i);
           list.remove(0);
       }
    }
}
