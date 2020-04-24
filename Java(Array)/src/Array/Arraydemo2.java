package Array;
//数组引用传递
public class Arraydemo2 {

	public static void main(String[] args) {
		int data []=new int []{12,23,34};  //静态初始化
		int temp []=data;      //引用传递
		temp [0]=99;
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
	}
}
