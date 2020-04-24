package StringSplit;
//第十四节 字符串拆分：
//拆分制定个数
public class Stringdemo2 {
	public static void main(String[] args) {
		String str = "hello world hello baidu";
		String result [] = str.split(" ",2);  //按照空格拆分，拆成两个（即字符串数组最大长度为2）
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
}
