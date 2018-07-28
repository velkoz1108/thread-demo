package demo6;

import java.io.IOException;

/**
 * @author : want
 * @Team Home
 * @date : 2018-7-28 9:54 星期六
 */

public class SaverThread extends Thread {
    private final Data data;

    public SaverThread(String name, Data data) {
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        try {
            while (true) {
                //要求保存数据
                data.save();
                //休眠约1秒
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
