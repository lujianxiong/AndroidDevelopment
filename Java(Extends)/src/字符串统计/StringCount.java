package 字符串统计;
//第二十二节 字符串统计：
//面向对象的结构化设计
//统计字母n和o的个数
public class StringCount extends StringUtil{
	private int ncount;
	private int ocount;
	
	public StringCount(String content){
		super(content);
		this.countChar();   //构造方法统计
	}
	public void countChar(){
		char[] data = super.getContent().toCharArray();   //调用父类的content
		for(int x=0;x<data.length;x++){
			if(data[x] == 'n'|| data[x] == 'N'){
				this.ncount++;
			}
			if(data[x] == 'o'|| data[x] == 'O'){
				this.ocount++;
			}
		}
	}
	public int getNCount(){
		return this.ncount;
	}
	public int getOCount(){
		return this.ocount;
	}
	public String getInfo(){
		return "字母n的个数："+this.ncount+"、字母o的个数："+this.ocount;
	}
}
