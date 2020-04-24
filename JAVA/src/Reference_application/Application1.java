package Reference_application;
//第11节 类关联结构（引用传递的实际应用）

//假设有的人可以有一辆汽车，有的人没有汽车，只有11路车可以使用，
//通过面向对象的设计来解决以上的关系转换
public class Application1 {

	public static void main(String[] args) {
		//第一步：声明对象并且设置彼此的关系
		Person person=new Person("林强",29);
		Car car=new Car("法拉利",200000);
		person.setCar(car);   //一个人有一辆车
		car.setPerson(person);  //一辆车属于一个人
		//第二步：根据关系获取数据
		System.out.println(person.getCar().getInfo());  //代码链
		System.out.println();
		System.out.println(car.getPerson().getInfo());
	}

}
