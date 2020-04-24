package StringLookup;
//第十二节：字符串查找：
//使用lastIndexOf()查找
public class Stringdemo3 {
	public static void main(String[] args) {
		String str = "www.baidu.com";
		System.out.println(str.lastIndexOf(".")); 
		//从后往前查，查到的是第二个“.”，因此返回的是9
		
		System.out.println(str.lastIndexOf(".",5));
		//从第五个位置从后往前查，因此查到的是第一个“.”，返回的是3
	}

}
