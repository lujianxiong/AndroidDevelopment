package Array;
//随意定义一个int数组，要求可以计算出这个数组元素的总和，最大值，最小值，平均值；
public class Arraydemo4 {
	public static void main(String[] args) {
		int data []=new int [] {1,2,3,4,5};
		ArrayUtil util= new ArrayUtil(data);    //进行数据计算
		
		System.out.println("数组内容总和："+util.getSum());
		System.out.println("数组内容平均值："+util.getAvg());
		System.out.println("数组内容最大值："+util.getMax());
		System.out.println("数组内容最小值："+util.getMin());
	}
}
