package Array;
//第六节 数组排序
public class ArrayUtil_sort {        //进行数组排序
	public static void sort(int data[]){
		//加上static可以通过类名称来调用
		for(int x=0;x<data.length-1;x++){
			for(int y=0;y<data.length-x-1;y++){
				if(data[y]>data[y+1]){    //交换数据
				int temp=data[y+1];
				data[y+1]=data[y];
				data[y]=temp;
				}
			}
		}
	}
	public static void printArray(int temp []){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");
		}
		System.out.println();
	}
}
