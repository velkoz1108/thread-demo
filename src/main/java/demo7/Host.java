package demo7;

import java.util.concurrent.TimeoutException;

/**
 * @author : want
 * @Team Home
 * @date : 2018-7-28 10:45 星期六
 */
public class Host {
    //超时时间
    private final long timeout;
    //方法正常执行时值为true
    private boolean ready = false ;


    public Host(long timeout) {
        this.timeout = timeout;
    }

    //修改状态
    public synchronized void setExecutable(boolean on){
        ready = on;
        notifyAll();
    }

    //检查状态之后再执行
    public synchronized void execute() throws TimeoutException, InterruptedException {
        long start = System.currentTimeMillis();
        while (!ready){
            long now = System.currentTimeMillis();
            //剩余等待时间
            long rest = timeout - (now-start);
            if (rest<=0){
                throw new TimeoutException("now - start = "+(now-start)+", timeout = "+timeout);
            }
            wait(rest);
        }
        doExecute();
    }

    //实际的处理
    private void doExecute() {
        System.out.println(Thread.currentThread().getName() + " calls doExecute");


    }

}
