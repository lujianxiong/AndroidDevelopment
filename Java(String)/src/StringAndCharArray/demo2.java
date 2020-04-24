package StringAndCharArray;
//第九节——字符串和字符数组
//实现字符串与字符数组的转换
public class demo2 {
	public static void main(String[] args) {	
		String str = "helloword";
		char[] result = str.toCharArray();//将字符串变成字符数组
		for(int i =0;i<result.length;i++){
			result[i]-=32;//编码减少32，将小写转换成大写字母
		}
		String newstr = new String(result);  
		//这里使用了String类的构造方法：public String(char[]value)
		//将传入的字符数组全部变为字符串
		System.out.println(newstr);
		System.out.println(new String(result,0,5));
		//这里使用了String类的另一个构造方法：
		//public String​(char[] value,int offset, int count)
		//将传入的数组从offset开始count个字符转化为字符串
	}
}
