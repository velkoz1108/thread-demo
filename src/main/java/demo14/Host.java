package demo14;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/2 15:57
 */

public class Host {
    public Data request(final int count, final char c) {
        System.out.println("    request(" + count + ", " + c + ") begin ...");
        //创建FutureData的实例
        final FutureData futureData = new FutureData();

        //启动一个线程,用于创建RealData的实例
        new Thread() {
            @Override
            public void run() {
                RealData realData = new RealData(count, c);
                futureData.setRealData(realData);
            }
        }.start();

        //返回FutureData的实例
        return futureData;
    }
}
