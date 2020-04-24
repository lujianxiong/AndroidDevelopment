package Array;
//数组排序分析：
public class Array_Sorting {
	public static void main(String[] args) {
	int data [] =new int [] {8,9,0,2,3,5,10,7,6,1};
	ArrayUtil_sort.sort(data);  //通过类名称调用ArrayUtil_sort类的方法进行排序
	ArrayUtil_sort.printArray(data);
	
	}
}
