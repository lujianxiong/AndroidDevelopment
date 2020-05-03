package 对象向上转型;
//第十四节：对象向上转型(接受或返回参数的统一性)
public class Javademo {
	public static void main(String[] args) {
		//DatabaseMessage msg = new DatabaseMessage();
		//上面是正常的new一个子类对象，下面是实现一个向上转型
		//向上转型实现的两个条件：
		//1.子类实现父类的继承关系并且实现方法的覆写   2.new的是一个子类对象
		fun(new DatabaseMessage());  //这里就相当于 Message msg = new DatabaseMessage()
		fun(new WebServerMessage());        // Message msg = new WebServerMessage()
	}
	
	public static void fun(Message msg){
		//不管传递进来的是Message的哪一个子类，都可以接受
		//而且两个子类都覆写的print方法，所以都可以通过fun方法调用
		msg.print();
	}

//	//如果没有向上转型，采用重载如下：
//	//利用重载可以实现与之前完全一样的效果，但是程序类设计的时候，除了满足当前的要求之外，还需要考虑到设计的维护性
//	public static void fun(DatabaseMessage msg){
//		msg.print();
//	}
//	public static void fun(WebServerMessage msg){
//		msg.print();
//	}
//	

}
