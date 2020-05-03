package 字符串统计;
//第二十二节 字符串统计：
//面向对象的结构化设计
public class StringUtil {
	private String content;   //需要保存的字符串
	
	public StringUtil(String content){
		this.content = content;
	}
	public String getContent(){
		return this.content;
	}
	public String Info(){     // 默认的信息返回
		return this.getContent();
	}
	
}
