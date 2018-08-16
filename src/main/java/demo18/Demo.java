package demo18;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/16 14:54
 */

public class Demo {
    public static void main(String[] args) {
        new ClientThread("Alice").start();
        new ClientThread("Bobby").start();
        new ClientThread("Chris").start();
    }
}
