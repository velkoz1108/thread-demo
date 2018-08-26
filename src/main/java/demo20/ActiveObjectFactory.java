package demo20;


/**
 * @author : wangtao
 * @date : 2018/8/16 19:18  星期四
 */


public class ActiveObjectFactory {
    public static ActiveObject createActiveObject() {
        return new ActiveObjectImpl();
    }
}
