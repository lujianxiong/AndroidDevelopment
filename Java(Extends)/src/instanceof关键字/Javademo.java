package instanceof关键字;
//第十六节 instanceof关键字：
//观察instanceof
//instanceof 关键字可以判断某个实例是否是某的类的对象
public class Javademo {
	public static void main(String[] args) {
		Person per = new Person();     //不转型
		System.out.println(per instanceof Person);  //true
        System.out.println(per instanceof SuperMan);  //false
        System.out.println("-----------------------------");  

        Person per2 = new SuperMan();     //转型
		System.out.println(per2 instanceof Person);  //true
        System.out.println(per2 instanceof SuperMan);  //true
	}

}
