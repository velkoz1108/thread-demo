package demo6;

import java.io.IOException;
import java.util.Random;

/**
 * @author : want
 * @Team Home
 * @date : 2018-7-28 9:59 星期六
 */
public class ChangerThread extends Thread {
    private final Data data;
    private final Random random = new Random();

    public ChangerThread(String name, Data data) {
        super(name);
        this.data = data;
    }


    @Override
    public void run() {
        try {
            for (int i = 0; true; i++) {
                //修改数据
                data.change("No." + i);
                //执行其他操作
                Thread.sleep(random.nextInt(1000));
                //显示地保存
                data.save();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
