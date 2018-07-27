package demo5.two;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/27 18:48
 */

public class RequestQueue {
    //LinkedList非线程安全
    private final BlockingQueue<Request> queue = new LinkedBlockingQueue<Request>();

    public synchronized Request getRequest() {
        Request request = null;
        try {
            request = queue.take();
        } catch (InterruptedException e) {
        }
        return request;
    }

    public synchronized void putRequest(Request request) {
        //offer将元素添加到队列末尾
        queue.offer(request);
        notifyAll();
    }
}
