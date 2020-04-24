package Array;
//通过方法修改数组内容
public class ArrayAndMethod2 {
	public static void main(String[] args) {
		int data [] = new int[] {1,2,3,4,5};
		changeArray(data);    //修改数组内容
		printArray(data);     //传递数组

	}
	public static void changeArray(int arr[]){
		// changeArray 方法调用完就结束了，arr就消失了；
		for(int i=0;i<arr.length;i++){
			arr[i]*=2;       //每个元素的内容乘2保存
		}
	}
	public static void printArray(int temp []){
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	}
}
