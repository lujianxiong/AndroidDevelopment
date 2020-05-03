package 多态性;
//第十三节 多态性：
//方法的多态性
public class Javademo {
	public static void main(String[] args) {
		//方法的多态性——覆写
		new DatabaseMessage().print();
		new NetworkMessage().print();
		//方法的多态性——重载
		new Message().print();
		new Message().print("【方法重载】");
	}

}
