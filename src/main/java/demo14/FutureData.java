package demo14;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/2 16:03
 */

public class FutureData implements Data {
    private RealData realData = null;
    private boolean ready = false;

    public synchronized void setRealData(RealData realData) {
        if (ready) {
            return;
        }
        this.ready = true;
        this.realData = realData;
        notifyAll();
    }

    public synchronized String getContent() {
        while (!ready) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        return realData.getContent();
    }
}
