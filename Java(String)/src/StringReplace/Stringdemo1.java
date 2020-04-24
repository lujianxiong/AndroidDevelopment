package StringReplace;
//第十三节 字符串替换：
//replaceAll、replaceFirst的使用
public class Stringdemo1 {
	public static void main(String[] args) {
		String str = "helloworld";
		System.out.println(str.replaceAll("l", "X"));  //替换全部
		System.out.println(str.replaceFirst("l", "X"));  //替换首个
	}
}
