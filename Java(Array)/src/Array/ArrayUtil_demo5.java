package Array;
//第七节：数组转置工具类
public class ArrayUtil_demo5 {
	public static void reverse(int data []){
		int center=data.length/2;   //确定转换的次数
		int head=0;   //操作脚标
		int tail=data.length-1;  //操作脚标
		for(int i=0;i<center;i++){
			int temp =data [head];
			data [head] =data [tail];
			data [tail] =temp;
			head++;
			tail--;
		}
	}
	public static void printArray(int temp []){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}
}
