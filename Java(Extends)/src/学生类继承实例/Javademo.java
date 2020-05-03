package 学生类继承实例;
//第二十节 学生类继承实例（继承、覆写）：
public class Javademo {
	public static void main(String[] args) {
		Student stu = new Student("张三","天安门",'男',12,78.99,100.00);
		System.out.println(stu.getInfo());
		
		Person per = new Person("李四","南京");
		System.out.println(per.getInfo());
	}

}
