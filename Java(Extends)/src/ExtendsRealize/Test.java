package ExtendsRealize;
//第二节 继承的实现： （子类不定义功能实现子类方法调用）
public class Test {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setAge(20);        //父类定义的输出
		stu.setName("Da_xiong");
		System.out.println("姓名："+stu.getName()+" 年龄："+stu.getAge());
	}

}
