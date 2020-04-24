package SubString;
//第十五节 字符串的截取：
//观察字符串的截取
public class Stringdemo2 {
	public static void main(String[] args) {
		//字符串结构：“用户id-photo-姓名.后缀”
		//下面实现返回字符串中的姓名结构：
		String str = "amdin-photo-Da_xiong.jpg";
		int beginIndex = str.indexOf("-", str.indexOf("photo"))+1;
		int endIndex = str.lastIndexOf(".");
		System.out.println(str.substring(beginIndex, endIndex));
	}

}
