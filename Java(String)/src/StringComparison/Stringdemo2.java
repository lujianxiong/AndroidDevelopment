package StringComparison;
//第十一节：字符串比较：public boolean equalsIgnoreCase​(String anotherString)
public class Stringdemo2 {
	public static void main(String[] args) {
		String strA = "baidu";
		String strB = "BAIDU";
		System.out.println(strA.equalsIgnoreCase(strB));   //true
	}

}
