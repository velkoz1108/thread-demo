package demo10;

import java.util.concurrent.Exchanger;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 11:07
 */

public class Demo {
    public static void main(String[] args) {
        Exchanger<char[]> exchanger = new Exchanger<char[]>();
        char[] buffer1 = new char[10];
        char[] buffer2 = new char[10];
        new ProducerThread(exchanger, buffer1, 123123).start();
        new ConsumerThread(exchanger, buffer2, 1342523).start();
    }
}
