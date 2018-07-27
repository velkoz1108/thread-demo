package demo5;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/27 18:48
 */

public class RequestQueue {
    //LinkedList非线程安全
    private final Queue<Request> queue = new LinkedList<Request>();

    public synchronized Request getRequest() {
        //peek() 如果队列中存在元素，则返回头元素，如果为空，则返回null。不移除元素
        //queue.peek() != null 守护条件
        while (queue.peek() == null) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        //移除队列中的第一个元素，并且返回该元素
        return queue.remove();
    }

    public synchronized void putRequest(Request request) {
        //offer将元素添加到队列末尾
        queue.offer(request);
        notifyAll();
    }
}
