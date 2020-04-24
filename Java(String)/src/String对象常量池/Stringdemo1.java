package String对象常量池;
//静态常量池
public class Stringdemo1 {
//本程序之中所给出的内容全部都是常量数据（字符串的常量都是匿名对象），
//最终程序加载的时候会自动帮助开发者处理好相应的连接
	public static void main(String[] args) {
		String strA = "www.mldn.cn";
		String strB = "www."+"mldn"+".cn";
		System.out.println(strA == strB);  //true
		//这里的strB在程序运行时进行连接，得到的字符串与strA相同，所以strB就直接引用strA
		//的地址，不会另外开辟空间，所以strA与strB村的地址是一样的
	}
}
