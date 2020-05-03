package 过期声明Deprecated;
//第十节 过期声明（@Deprecated注解）
public class Javademo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		new Channel().connect();
	}

}
