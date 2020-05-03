package 方法覆写限制;
//第六节 方法覆写限制
public class DatabaseChannel extends Channel{  //要进行数据库的连接
	//此时下面这个方法并不是覆写，因为父类的connect()方法对子类不可见，
	//那么这个方法对于子类而言相当于是一个新定义的方法，与覆写没有任何的关系。
	public void connect(){  
		System.out.println("【子类】进行数据库资源的连接");
	}
}
