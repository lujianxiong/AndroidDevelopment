package Reference_application_2;

public class Person {
	private String name;
	private int age;
	private Car car;   //一个人有多辆车
	private Person children[];    //一个人有多个孩子
	
	public Person(String name,int age){
		this.age=age;
		this.name=name;
	}
	
	
	public Person[] getChildren() {
		return children;
	}

	public void setChildren(Person[] children) {
		this.children = children;
	}



	public String getInfo(){
	    return "人的名字是："+this.name+" ；年龄为："+this.age;
	}
	//setter、getter省略

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
		
}
