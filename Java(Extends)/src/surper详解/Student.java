package surper详解;
//第三节：子对象实例化流程
public class Student extends Person{
	@SuppressWarnings("unused")
	private String school;
	
	public Student(String name,int age,String school){  //构造方法
		super(name,age);   //明确调用父类构造    父类里没有提供无参构造，必须利用super()明确调用有参构造。
		this.school=school;
	}
	

}
