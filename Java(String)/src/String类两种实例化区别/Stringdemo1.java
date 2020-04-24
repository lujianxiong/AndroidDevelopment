package String类两种实例化区别;
//String直接赋值时的数据共享
public class Stringdemo1 {
	public static void main(String[] args) {
		String strA = "baidu";
		String strB = "baidu";
		//如果两个对象的地址相同，那么这两个对象就是同一个对象
		System.out.println(strA == strB);  //两个对象使用"=="判断的是对象的地址值是否相等
		
	}

}
