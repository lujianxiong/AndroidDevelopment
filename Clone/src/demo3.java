public class demo3 {
    //clone开辟内存空间分析
    //验证Java中的clone方法是浅拷贝
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p = new Person();
        Person p1 = (Person)p.clone();

        String result = p.getName() == p1.getName()?"clone是浅拷贝":"clone是深拷贝";
        System.out.println(result);
    }
}
