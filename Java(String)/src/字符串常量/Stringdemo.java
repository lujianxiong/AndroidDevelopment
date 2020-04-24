package 字符串常量;
//验证字符串常量是匿名类对象
public class Stringdemo {
	public static void main(String[] args) {
		String str = "baidu";
		System.out.println("baidu".equals(str));     //true
		//"baidu"能调用equals方法，说明这是个匿名类对象
	}

}
