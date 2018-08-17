package demo19;

/**
 * @author : wangtao
 * @date : 2018/8/16 19:54  星期四
 */


public class SchedulerThread extends Thread {
    private final ActivationQueue queue;

    @Override
    public void run() {
        while (true) {
            MethodRequest request = queue.takeRequest();
            request.execute();
        }
    }

    public void invoke(MethodRequest request) {
        queue.putRequest(request);
    }

    public SchedulerThread(ActivationQueue queue) {
        this.queue = queue;
    }
}
