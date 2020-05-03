package 学生类继承实例;
//第二十节 学生类继承实例（继承、覆写）：
public class Person {
	//定义四个私有属性
	private String name;
	private String addr;
	private char sex;
	private int age;
	
	public Person(){}   //单参构造
	public Person(String name,String addr){   //双参构造
		this(name,addr,'男',0);   //双参构造调用多参构造
	}
	
	public Person(String name,String addr,char sex,int age){  //多参构造
		this.name = name;
		this.addr = addr;
		this.sex = sex;
		this.age = age;
	}
	
	public String getInfo(){   //输出方法
		return "姓名："+this.name+"、地址："+this.addr+"、性别："+this.sex+"、年龄："+this.age;
	}
}
