package demo6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author : want
 * @Team Home
 * @date : 2018-7-28 9:35 星期六
 */
public class Data {
    private final String filename;
    private String content;
    private boolean changed;

    public Data(String filename, String content) {
        this.filename = filename;
        this.content = content;
        this.changed = true;
    }

    //修改数据
    public synchronized void change(String newContent) {
        content = newContent;
        changed = true;
    }
    //若内容修改过，则保存到文件中
    public synchronized void save() throws IOException {
        if (!changed) {
            return;
        }
        doSave();
        changed = false;
    }
    //将数据内容实际保存到文件中
    private void doSave() throws IOException {
        System.out.println(Thread.currentThread().getName() + " calls doSave, content = " + content);
        Writer writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }
}
