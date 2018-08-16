package demo18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author : Twin
 * @date : 2018/8/16 14:55
 * 创建日志的类
 */

public class TSLog {
    private PrintWriter writer = null;

    //初始化writer
    public TSLog(String filename) {
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //写日志
    public void println(String s) {
        writer.println(s);
    }

    //关闭日志
    public void close() {
        writer.println("===End of log ===");
        writer.close();
    }
}
