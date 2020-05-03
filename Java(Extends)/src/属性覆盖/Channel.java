package 属性覆盖;
//第七节 属性覆盖：
public class Channel {
	//String info = "www.baidu.com";
	
	//假设属性被封装（加private权限）
	private String info = "www.baidu.com";
	//子类不能直接访问该属性，但是子类是继承了父类所有的，private的是隐式继承，可以通过父类函数间接调用
	public String getinfo(){
		return this.info;
	}
}
