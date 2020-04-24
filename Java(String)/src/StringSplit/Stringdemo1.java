package StringSplit;
//第十四节 字符串拆分：
//全部拆分：将一个字符串按照某个规则进行拆分为字符串数组
public class Stringdemo1 {
	public static void main(String[] args) {
		String str = "hello world hello baidu";
		String result [] = str.split(" ");  //按照空格拆分
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}
