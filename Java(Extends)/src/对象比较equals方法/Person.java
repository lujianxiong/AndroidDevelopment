package 对象比较equals方法;
//第十九节 对象比较（equals方法）
//基础对象比较
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
