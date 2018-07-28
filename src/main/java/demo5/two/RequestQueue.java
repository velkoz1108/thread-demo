package demo5.two;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/27 18:48
 */

public class RequestQueue {
    //LinkedBlockingQueue 线程安全的队列  take   put
    private final BlockingQueue<Request> queue = new LinkedBlockingQueue<Request>();

    public synchronized Request getRequest() {
        Request request = null;
        try {
            request = queue.take();
        } catch (InterruptedException e) {
        }
        return request;
    }

    public void putRequest(Request request) {
        try {
            queue.put(request);
        } catch (InterruptedException e) {
        }
    }
}
