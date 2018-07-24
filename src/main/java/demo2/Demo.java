package demo2;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/24 14:36
 */

public class Demo {
    public static void main(String[] args) {
        //最多只能3个同时使用
        BoundedResource resource = new BoundedResource(3);
        for (int i = 0; i < 10; i++) {
            new UserThread(resource).start();
        }
    }
}
