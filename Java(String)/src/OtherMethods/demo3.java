package OtherMethods;
//第十七节 其他重要操作方法：
//管擦length()方法和trim()方法
public class demo3 {
	public static void main(String[] args) {
		String str = "       Hello  World         ";
		System.out.println(str);
		System.out.println(str.length());  //输出字符串长度
		System.out.println(str.trim()); 
		System.out.println(str.trim().length());
	}

}
