package 字符串不可修改;
//String不可修改
//整个操作里，字符串内容没有发生任何改变，改变的只是引用
//这种改变将有可能带来大量的垃圾空间
public class Javademo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "www.";   //开辟一个栈内存str  ，一个对堆内存“www.”
		str += "baidu";     
		//先开辟一个堆内存“baidu” ，然后对字符串连接操作，新的字符串开辟一个堆内存，将str指向该字符串
		//与此同时，两个没人要的堆内存空间将成为垃圾
		str = str +".com";
		//这一行代码同上
		System.out.println(str);

	}

}
