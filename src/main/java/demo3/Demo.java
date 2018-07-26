package demo3;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/24 15:12
 */

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Alice","Alaska");
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
    }
}
