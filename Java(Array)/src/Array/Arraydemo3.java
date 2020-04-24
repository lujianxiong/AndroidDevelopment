package Array;
//foreach输出
public class Arraydemo3 {
	public static void main(String[] args) {
		int data []=new int []{1,2,3,4,5};
		for(int temp:data){  // 自动循环，将data数组的每一个内容交给temp
			System.out.print(temp+"  ");
		}
	}

}
