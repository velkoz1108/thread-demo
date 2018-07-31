package demo12.old;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 16:29
 */

public class Demo {
    public static void main(String[] args) {
        System.out.println("main begin ");
        Host host = new Host();
        host.request(10,'A');
        host.request(20,'B');
        host.request(30,'C');
        System.out.println("main end ");
    }
}
