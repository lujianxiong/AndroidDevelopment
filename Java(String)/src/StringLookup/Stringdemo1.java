package StringLookup;
//第十二节：字符串查找：之判断字符串是否存在
//判断子字符串是否存在:public boolean contains(String s)
public class Stringdemo1 {
	public static void main(String[] args) {
		String strA = "www.baidu.com";
		System.out.println(strA.contains("baidu"));  //true
		System.out.println(strA.contains("hello"));  //false
		//此方法的操作相对直观一些，但这个方法是从JDK1.5之后开始追加到程序之中的。

	}

}
