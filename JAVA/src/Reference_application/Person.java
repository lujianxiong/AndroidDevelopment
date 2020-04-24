package Reference_application;

public class Person {
	private String name;
	private int age;
	private Car car;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getInfo(){
		return "姓名："+this.name+"\n年龄："+this.age;
	}
	//setter、getter略

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {//一个人配一辆车
		this.car = car;
	}
}
