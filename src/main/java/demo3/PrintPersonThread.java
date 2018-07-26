package demo3;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/24 15:21
 */

public class PrintPersonThread extends Thread {
    private Person person;

    public PrintPersonThread(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+" prints : " + person);
        }
    }
}
