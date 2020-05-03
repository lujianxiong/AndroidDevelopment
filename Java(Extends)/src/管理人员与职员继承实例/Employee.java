package 管理人员与职员继承实例;
//第二十一节 管理人员与职员继承实例：
//员工类
public class Employee {
	private String name;
	private int age;
	private char sex;
	
	public Employee(){}

	public Employee(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public String getInfo(){
		return "姓名："+this.name+"、年龄："+this.age+"、性别："+this.sex;
	}
	
}
