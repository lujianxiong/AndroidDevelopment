package Reference_application_2;

public class Application {
	public static void main(String[] args) {

		Person person = new Person("吴硕",20);
		Car car = new Car("保时捷",200000);
		person.setCar(car);
		car.setPerson(person);
		
		//对吴硕的孩子实例化并操作
		Person childA = new Person("林强",18);
		Person childB = new Person("王刚",19);
		childA.setCar(new Car("BMW X1",100000));   //匿名对象
		childB.setCar(new Car("法拉利",200000));
		person.setChildren(new Person[]{childA,childB});   //一个人有多个孩子
		
		
		//根据关系获取数据
		System.out.println(person.getCar().getInfo());
		System.out.println(car.getPerson().getInfo());
		
		//根据人找到所有的孩子以及对应的汽车
		for(int x=0;x<person.getChildren().length;x++){
			System.out.println("\t|-"+person.getChildren()[x].getInfo());
			System.out.println("\t\t|-"+person.getChildren()[x].getCar().getInfo());
		}
	}

}
