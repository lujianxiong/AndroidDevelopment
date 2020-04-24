package StringComparison;
//第十一节：字符串比较：public int compareTo (String anotherString)
//该方法会返回一个int数据，该数据有三种取值：大于（>0）、小于（<0）、等于（=0）
public class Stringdemo3 {
	public static void main(String[] args) {
		String strA = "m";
		String strB = "M";
		String strC = "baidu";
		String strD = "baidU";
		System.out.println(strB.compareTo(strA));   
		//strA.compareTo(strB)输出32,相当于m-M，返回两者的差
		//A和B交换位置，输出的是-32
		System.out.println(strC.compareTo(strD));   //输出32	
		//前面baid相同，就不算了，u与U进行ASCLL码相减
		System.out.println("HELLO".compareTo("HELLO"));  //输出0

	}

}
