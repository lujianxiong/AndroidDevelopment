package String对象常量池;
//运行时常量池
public class Stringdemo2 {
	public static void main(String[] args) {
		 String info = "mldn";
		 String strA = "www.mldn";
		 String strB = "www."+info+".cn";
		 //之所以是一个false，是因为程序在加载的时候并不确定info是什么内容。
		 //程序加载的时候进行字符串连接info采用的是变量，变量的内容是可以修改的，
		 //所以它不认为最终的strB的结果就是一个所需要的最终的结果
		 System.out.println(strA == strB); 
		 //这里的strB存入的是运行时常量池里去了，没用复用strA，所以地址不一样！
	}
}
