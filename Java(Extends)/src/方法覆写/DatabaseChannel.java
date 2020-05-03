package 方法覆写;
//第五节 方法覆写
public class DatabaseChannel extends Channel{  //要进行数据库的连接
	public void connect(){  //保留已有的方法名称，而后进行覆写
		super.connect();  //直接调用父类中的方法
		//如果直接这样写：connect();  就会报错，陷入死循环，connect()默认是：this.connect();
		//是在先从本类中找connect方法，一找找到了，然后就循环调用自己了
		System.out.println("【子类】进行数据库资源的连接");
		
	}

}
//只要是在子类中调用父类方法的时候一定要在方法前面追加有“super.方法”