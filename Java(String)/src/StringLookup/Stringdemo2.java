package StringLookup;
//第十二节：字符串查找：之判断字符串是否存在
//判断子字符串是否存在:public boolean indexOf(String str)
public class Stringdemo2 {
	public static void main(String[] args) {
		String str = "www.baidu.com";
		System.out.println(str.indexOf("baidu"));  //输出4  4表示4是在str中第5个位置开始的(从0开始数)
		System.out.println(str.indexOf("hello"));  //输出-1 -1是指没有查到
		//在JDK1.5之前如果要查询数据往往只能够依靠indexOf()方法来完成
		if(str.indexOf("baidu")!=-1)
			System.out.println("数据存在!");
		//与contains想比,这个方法略显罗嗦
		//indexOf我们需要先查找位置,在进行处理
		//indexOf最早是为了进行子字符串位置的查询，在开发之中我们可以利用此形式进行一些索引的位置的确定
	}

}
