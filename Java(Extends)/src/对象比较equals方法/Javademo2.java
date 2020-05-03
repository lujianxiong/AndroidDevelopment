package 对象比较equals方法;
//第十九节 对象比较（equals方法）
//观察Object类中的equals方法覆写
public class Javademo2 {
	public static void main(String[] args){
		Person2 perA = new Person2("zhangsan",20);
		Person2 perB = new Person2("zhangsan",20);
		System.out.println(perA.equals(perB));  //true
		System.out.println(perA.equals("狗"));  //true
		//将判断放到了内部进行判断，体现了Java的封装性。
		
	}

}
