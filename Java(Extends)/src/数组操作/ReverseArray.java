package 数组操作;

//定义反转子类
public class ReverseArray extends Array{

	public ReverseArray(int len) {
		super(len);
	}
	
	public int[] getData(){
		int center = super.getData().length/2;
		int head = 0;    //首
		int tail = super.getData().length-1;   //尾
		for(int x =0;x<center;x++){
			int temp = super.getData()[head];
			super.getData()[head] = super.getData()[tail];
			super.getData()[tail] = temp;
			head++;
			tail--;
		}
		return super.getData();
	}
	
}
