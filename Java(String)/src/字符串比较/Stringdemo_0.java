package 字符串比较;
//使用==进行字符串比较      （false）（这种方式不准确）
public class Stringdemo_0 {
	public static void main(String[] args) {
		String strA="baidu";
		String strB = new String("baidu");
		System.out.println(strA==strB);    //falseg
	}

}
