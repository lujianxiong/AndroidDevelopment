package 多态性;
//第十三节 多态性：
//方法的多态性
public class Message {
	public void print(){//无参
		System.out.println("【方法重载】www.baidu.com");
	}
	public void print(String str){//单参
		System.out.println(str);
	}

}
