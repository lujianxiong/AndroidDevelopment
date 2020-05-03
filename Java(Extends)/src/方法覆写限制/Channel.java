package 方法覆写限制;
//第六节 方法覆写限制
public class Channel {
	private void connect(){  
		//父类connect方法 default权限，可以通过实例化子类覆写父类
		System.out.println("【Channel父类】进行资源的连接");
	}
	
	public void fun(){
		this.connect();    //调用本类connect方法
	}
}
