package Object类简介;
//第十七节 Object类简介：
//Object类接受子类对象
public class Javademo {
	public static void main(String[] args) {
		Object obj = new Person();   //向下转型
		if(obj instanceof Person){   //判断实例是否是Person类对象，用于向下转型时检查用
			Person per = (Person) obj;  //向下转型
			System.out.println("Person对象向下转型执行完毕");
		}
	}

}
