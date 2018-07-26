package demo3;

/**
 * @author : Twin
 * @Team Atplan
 * @date : 2018/7/24 15:14
 */
//防止子类继承，修改字段
public final class Person {
    //final
    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
//没有setter方法修改值
    public String getName() {
        return name;
    }

    public String getAddress() {

        return address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"address\":\"")
                .append(address).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
