package final关键字;
//第八节 final关键字
public class demo {
	public static void main(String[] args) {
		// String info = "baidu";  //false
		final String info = "baidu";   //true
		String strA = "www.baidu.com";
		String strB = "www."+info+".com";
		System.out.println(strA == strB);     //info加了final后，info、strB变成常量了
		//在方法中可以使用final来定义参数，此时也表示常量
	}

}
