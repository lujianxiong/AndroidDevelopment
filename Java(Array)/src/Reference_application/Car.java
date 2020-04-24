package Reference_application;

public class Car {
	private double price;
	private String name;
	private Person person;
	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	
	public String getInfo(){
		return "汽车的品牌型号："+this.name+"\n汽车的价值："+this.price;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {//一个车载一个人
		this.person = person;
	}

}
