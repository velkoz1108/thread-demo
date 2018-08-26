package demo21;

/**
 * @author : want
 * @Team Home
 * @date : 2018-8-26 19:28 星期日
 * 重排序 Demo  但是没出现 x<y 的结果
 */
public class ReorderDemo {
    public static void main(String[] args) {

        final SomeObj obj = new SomeObj();

        //读数据的线程B
        new Thread(() -> {
            obj.read();
        }).start();
        //写数据的线程A
        new Thread(() -> {
            obj.write();
        }).start();

    }
}

