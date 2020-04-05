package viewholder.listview.exmple.listviewviewholder;

public class Application {
    private String name;
    //    drawable的值的类型是int类型
    private int resId;

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", resId=" + resId +
                '}';
    }

    public Application(String name, int resId) {
        this.name = name;
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }


}
