package 字符串统计;
//第二十二节 字符串统计：
//定义一个单独的处理类
public class demo1 {
	public static void main(String[] args) {
		String str = "I want you to do something";
		int result[] = StringCalculate.count(str);
		System.out.println("字母n的个数"+result[0]);
		System.out.println("字母o的个数"+result[1]);

	}

}
