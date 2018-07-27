package demo5.one;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/27 18:44
 */

public class Request {
    private final String name;

    public Request(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }
}
