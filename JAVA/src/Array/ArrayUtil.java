package Array;
//此时的主类就好比我们使用电脑一样，只关心如何操作，而具体的操作过程被类进行包装了。
public class ArrayUtil {   //是一个操作工具类
	private int sum;     //保存总和
	private double avg;    //保存平均值 
	private int max;      //保存最大值
	private int min;      //保存最小值
	
	public ArrayUtil(int data []){    //进行数组计算
		this.max =data [0];  //假设第一个是最大值
		this.min =data [0];  //假设第一个是最小值
		for(int i=0;i<data.length;i++){
			if(data[i]>max){
				max=data [i];
			}
			if(data [i]<min){
				min=data [i];
			}
			sum+=data [i];
		}
		this.avg = this.sum/data.length;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}

}
