package StringFormatting;
//第十六节 字符串格式化 输出：
//格式化处理：
public class Stringdemo1 {
	public static void main(String[] args) {
		String name = "张三";
		int age = 18;
		double score = 98.7654321;
		String str = String.format("姓名：%s、 年龄：%d、 成绩：%5.2f", name,age,score);
		//5.2f，5是总共的数据，2是小数
		System.out.println(str);
	}

}
