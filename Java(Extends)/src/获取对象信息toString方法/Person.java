package 获取对象信息toString方法;
//第十八节 获取对象信息（toString方法）：
//观察toString方法
//覆写toString方法
public class Person {
	String name;
	int age;
	
	//构造方法进行实例化
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	//覆写toString方法
	@Override   //覆写方法注解
	public String toString(){
		return "姓名："+this.name+"、年龄："+this.age;
	}

}
