package StringLookup;
//第十二节：字符串查找：
//判断是否以指定字符串开头或结尾：startsWith、endsWith
//以后开发中很多设计都需要它的支持
public class Stringdemo4 {
	public static void main(String[] args) {
		String str = "**@@www.baidu.com##";
		//判断是否以“**”符号开头
		System.out.println(str.startsWith("**"));
		//判断是否以“##”符号结尾
		System.out.println(str.endsWith("##"));
		//从第二个开始判断是否以“@@”符号开头
		System.out.println(str.startsWith("@@", 2));
	}

}
