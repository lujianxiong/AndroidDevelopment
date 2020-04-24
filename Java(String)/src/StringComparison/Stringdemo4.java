package StringComparison;
//第十一节：字符串比较：public int compareToIgnoreCase​(String str)
//忽略大小写比较
public class Stringdemo4 {
	public static void main(String[] args) {
		String strA = "baidu";
		String strB = "baidU";
		System.out.println(strA.compareToIgnoreCase(strB)); //输出0 
		//在不计较大小写的情况下，此时的内容一样，所以两者的比较结果为0
		
		String strC = "baidu";
		String strD = "baigU";
		System.out.println(strC.compareToIgnoreCase(strD)); //输出-3 
		//bai一样，d比g的ASCLL码小3，后面的u忽略大小写，因此输出-3
	}

}
