package 字符串常量;
//假设一种字符串匹配的情况：
//用户输入内容进行匹配，但是用户可能有不输入，输入为空，就可能出现空指针情况：
public class Stringdemo2 {

	public static void main(String[] args) {
		String input = null;  //用户输入的内容
//		System.out.println(input.equals("baidu"));  //字符串常量在后面的情况： ERROR：空指针异常： java.lang.NullPointerException
		System.out.println("baidu".equals(input));  //字符串常量在前面的情况：
		//equals()方法里面提供有一个可以回避null的判断，如果将字符串常量写在前面，那么调用equals()方法的时候
		//永远都不可能出现“NullPointerException”，字符串常量是一个匿名对象，匿名对象一定是开辟好堆内存空间的对象
	}

}
