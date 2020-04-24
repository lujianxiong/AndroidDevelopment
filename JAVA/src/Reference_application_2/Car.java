package Reference_application_2;

public class Car {
	String name;
	int price;
	Person person;
	
	public Car(String name,int price){
		this.name=name;
		this.price =price;
	}
	//setter、getter、 略
	public String getInfo(){
		return "汽车的品牌型号："+this.name+" ；它的价格是："+this.price;
	}
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

}
