package 对象比较equals方法;
//第十九节 对象比较（equals方法）
//基础对象比较
public class Javademo {
	public static void main(String[] args) {
		Person perA = new Person("张三",20);
		Person perB = new Person("张三",20);
		if(perA.getName().equals(perB.getName()) &&
		   perA.getAge() == perB.getAge()){
			System.out.println("是同一个对象");
		}else{
			System.out.println("不是同一个对象");
		}
	}

}
