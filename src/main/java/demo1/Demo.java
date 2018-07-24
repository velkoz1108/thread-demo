package demo1;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/13 9:55
 */

public class Demo {
    public static void main(String[] args) {
        Thread.State[] values = Thread.State.values();
        for (Thread.State value : values) {

            System.out.println("value = " + value.name());
        }

    }
}
