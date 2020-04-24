package Array;
//数组与方法（通过方法引用传递数组）
public class ArrayAndMethod {
	public static void main(String[] args) {
		int data []= initArray();       //通过方法获得数组内容
		/*初始化的时候：调用initArray方法会在栈内存开辟一个空间arr，arr地址指向堆内存的五个int型数据
		 * 并在栈内存在开辟一个空间data，data同样指向五个int型数据。
		*/
		printArray(data);    //传递数组
		//调用printArray方法，在栈内存开辟一个temp空间，将data所指向的赋给temp，temp同样指向五个int型数据

	}
	public static int [] initArray(){
		int arr [] = new int [] {1,2,3,4,5};    //赋值
		return arr;              //返回一个数组
		//return new int [] {1,2,3,4,5};     这个可（是上面两步的合成）
		//return {1,2,3,4,5};      //这种简化做法不对
	}
	//要求接受一个int型的数组
	public static void printArray(int temp []){
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	}
}
