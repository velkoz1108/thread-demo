package demo6;

/**
 * @author : want
 * @Team Home
 * @date : 2018-7-28
 * <p>
 * Balking 模式  停止并返回
 * 不需要就算了
 */
public class Demo {
    public static void main(String[] args) {
        Data data = new Data("data.txt", "(empty)");
        new ChangerThread("ChangerThread", data).start();
        new SaverThread("SaverThread", data).start();
    }
}
