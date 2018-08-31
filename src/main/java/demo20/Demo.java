package demo20;

/**
 * @author : want
 * @Team Home
 * @date : 2018-8-26 9:19 星期日
 */
public class Demo {
    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        try {
            new MakerClientThread("Alice", activeObject).start();
            new MakerClientThread("Bobby", activeObject).start();
            new DisplayClientThread("Chrirs", activeObject).start();
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        } finally {
            System.out.println("**** shutdown ****");
            activeObject.shutdown();
        }
    }
}
