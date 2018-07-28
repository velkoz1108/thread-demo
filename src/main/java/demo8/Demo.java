package demo8;

/**
 * @author : want
 * @Team Home
 * @date : 2018-7-28 14:01 星期六
 */
public class Demo {
    public static void main(String[] args) {
        Table table = new Table(3);
        new MakerThread("MakerThread-1", table, 3121312L).start();
        new MakerThread("MakerThread-2", table, 12312L).start();
        new MakerThread("MakerThread-3", table, 23121312L).start();
        new EaterThread("EaterThread-1", table, 12312L).start();
        new EaterThread("EaterThread-2", table, 32312L).start();
        new EaterThread("EaterThread-3", table, 423312L).start();
    }
}
