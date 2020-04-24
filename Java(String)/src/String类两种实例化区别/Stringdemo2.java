package String类两种实例化区别;
//观察构造方法实例化String类对象时的池操作
public class Stringdemo2 {
	public static void main(String[] args) {
		String strA = "baidu";           //入池 
		String strB = new String("baidu");     //不入池
		String strC = new String("baidu").intern();
		System.out.println(strA == strB);  //false
		System.out.println(strA == strC);  //true

	}

}
