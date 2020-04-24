package OtherMethods;
//第十七节 其他重要操作方法：
//观察字符串连接 concat​()方法
public class demo1 {
	public static void main(String[] args) {
		String strA = "www.baidu.com";
		String strB = "www.".concat("baidu").concat(".com");
		System.out.println(strB);
		System.out.println(strA == strB);  //false
		//从结果来讲，内容虽然相同，但是false，所以这个操作没有实现静态的定义
		//这是运行时的结果，没有strB没有存到静态常量池中
	}

}
