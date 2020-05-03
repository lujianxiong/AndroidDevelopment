package 准确覆写Override;
//第十节 准确覆写(@Override)
public class DatabaseChannel extends Channel{
	@Override     //明确的表示该方法是一个覆写的方法
	public void connect (){
		System.out.println("子类定义的通道连接操作");
	}
}
