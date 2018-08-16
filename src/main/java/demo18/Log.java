package demo18;

/**
 * @author : wangtao
 * @date : 2018/8/16 14:56  星期四
 */


public class Log {
    private static final ThreadLocal<TSLog> TS_LOG_THREAD_LOCAL = new ThreadLocal<>();

    //写日志
    public static void println(String s) {
        getTSLog().println(s);

    }

    //关闭日志
    public static void close() {
        getTSLog().close();
    }

    private static TSLog getTSLog() {
        TSLog tsLog = TS_LOG_THREAD_LOCAL.get();

        //如果该线程是第一次调用本方法，就生成并注册一个日志
        if (tsLog == null) {
            tsLog = new TSLog(Thread.currentThread().getName() + "-log.txt");
            TS_LOG_THREAD_LOCAL.set(tsLog);
        }
        return tsLog;
    }
}
