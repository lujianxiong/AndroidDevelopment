public class demo2 {
    //clone开辟内存空间分析
    //new一个p，p1 引用 p，比较内存地址
    public static void main(String[] args) {
        Person p = new Person(23,"zhangsan");
        Person p1 = p ;

        System.out.println(p);
        System.out.println(p1);
    }
}
