package Array;
//数组反转1：定义一个新的数组而后按照逆序的方式保存
public class Arraydemo5 {
	public static void main(String[] args) {
		int data []=new int [] {1,2,3,4,5,6,7,8,9};
		int temp []=new int [data.length] ;
		int foot = temp.length-1;    //第二个数组的角标
		for(int i=0;i<data.length;i++){
			temp[foot--]=data[i];   //这个是关键代码；通过i控制data数组角标，以依次将data的数据与temp进行反转交换
		}
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");
		}
	}
}
