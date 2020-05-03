package 过期声明Deprecated;
//第十节 过期声明（@Deprecated注解）
public class Channel {
	
	//很久以前定义的一个无返回值的函数，现在觉得不好，
	@Deprecated   //老系统继续用，如果是新系统不要用了
	public void connect(){
		System.out.println("***************** Channel *****************");
	}
	//定义一个有返回值的函数
	public String connection(){
		return "获取了××××通道连接信息";
	}

}
