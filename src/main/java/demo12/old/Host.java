package demo12.old;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/31 16:43
 */

public class Host {
    private final Helper helper = new Helper();

    public void request(final int count, final char c) {
        System.out.println("    request (" + count + ", " + c + " ) Begin ... ");
        new Thread() {
            @Override
            public void run() {
                helper.handle(count, c);
            }
        }.start();
        System.out.println("    request (" + count + ", " + c + " ) End ... ");
    }
}
