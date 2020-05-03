package 数组操作;
//第二十三节 数组操作：
//数组操作类
public class Array {
	private int[] data; //整型数组
	private int foot;  //进行数组索引控制
	
	//构造方法开辟数组
	public Array(int len){
		if(len>0){
			this.data = new int[len];  //开辟len长度数组
		}else{
			this.data = new int[1];  //传入负值时开辟一个空间（防止报错）
		}
	}
	
	//实现数组的容量扩充(给出的是扩充大小，实际大小 = 已有大小+扩充大小)
	//数组的最大特征是长度是固定的，这也是数组的缺陷所在
	public void increment(int num){
		int newData[] = new int [this.data.length+num];
		System.arraycopy(this.data,0,newData,0,this.data.length);
		this.data = newData;  //改变数组引用		
	}
	
	//实现数据增加
	public boolean add(int num){   
		if(this.foot<this.data.length){  //有位置
			this.data[this.foot++] =num;   // 将传入的num数据存到当前索引的下一个处。
			return true;
		}
		return false;
	}
	
	public int[] getData(){
		return this.data;
	}

}
