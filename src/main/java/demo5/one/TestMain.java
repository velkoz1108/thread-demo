package demo5.one;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/27 19:35
 */

public class TestMain {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "Alice", 41223312L).start();
        new ServerThread(requestQueue, "Bobby", 12314324L).start();
    }
}
