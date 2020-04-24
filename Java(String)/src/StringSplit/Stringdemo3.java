package StringSplit;
//第十四节 字符串拆分：
//拆分拆不了的情况
public class Stringdemo3 {
	public static void main(String[] args) {
		String str = "192.168.1.2";
		String result [] = str.split("\\.");  //按照空格拆分  (拆分不了进行转义！！！！)
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}
