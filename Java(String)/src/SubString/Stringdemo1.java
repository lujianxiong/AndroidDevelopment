package SubString;
//第十五节 字符串的截取：
//substring()方法
public class Stringdemo1 {
	public static void main(String[] args) {
		String str = "www.baidu.com";
		System.out.println(str.substring(4));  //从第五个开始截取，一直到结束
		System.out.println(str.substring(4,9));  //截取字符串从第5个字符开始（含第5个）到第10个结束（不包括第10个）

	}

}
