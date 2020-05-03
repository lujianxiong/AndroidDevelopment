package 获取对象信息toString方法;
//第十八节 获取对象信息（toString方法）;
//观察toString方法
//覆写toString方法
public class Javademo {
	public static void main(String[] args) {
		Person per = new Person("张三",20);
		System.out.println(per);
		System.out.println(per.toString());  //Object继承而来
	}
}
