package demo14;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/8/2 16:04
 */

public class RealData implements Data {
    private final String content;

    public RealData(int count, char c) {
        System.out.println("    making ResultData(" + count + "," + c + ") begin ...");
        char[] buffer = new char[count];
        for (int i = 0; i < count; i++) {
            buffer[i] = c;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("    making ResultData(" + count + "," + c + ") end ...");
        this.content = new String(buffer);
    }

    public String getContent() {
        return content;
    }
}
