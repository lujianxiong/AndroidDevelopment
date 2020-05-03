package 子对象实例化流程;
//子对象实例化流程
public class Student extends Person{
	public Student(){  //构造方法
		super();   //在这里写于不写没有区别
		System.out.println("【Student子类】：一个新的Student实例化对象产生了");
	}

}
