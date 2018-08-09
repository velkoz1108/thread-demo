package demo16;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/9 18:54
 */

public class Demo {
    public static void main(String[] args) {
        System.out.println("main: Begin ...");

        //设置未捕获的异常处理器
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("***111***");
                System.out.println("UncaughtExceptionHandler: begin ...");
                System.out.println("thread : " + t);
                System.out.println("exception : " + e);
                System.out.println("UncaughtExceptionHandler: end ...");
            }
        });

        //设置退出钩子
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                    System.out.println("***222***");
                    System.out.println("shutdown hook: begin ...");
                    System.out.println("currentThread : " + Thread.currentThread());
                    System.out.println("shutdown hook: end ...");
                })
        );

        new Thread("MyThread") {
            @Override
            public void run() {
                System.out.println("MyThread: begin ...");
                System.out.println("MyThread: sleep ...");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }

                System.out.println("MyThread: divide ...");

                int x = 1 / 0;
                System.out.println("MyThread: end ...");
            }
        }.start();
        System.out.println("main : end ... ");
    }
}
