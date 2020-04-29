public class demo1 {
    //clone开辟内存空间分析
    //new一个p，p1 clone p ，比较内存地址
    public static void main(String[] args) {
        Person p = new Person(23,"zhangsan");
        Person p1=null;
        {
            try {
                p1 = (Person)p.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(p);
        System.out.println(p1);
    }
}
