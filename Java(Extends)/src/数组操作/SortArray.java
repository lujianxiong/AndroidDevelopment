package 数组操作;

//定义排序子类
public class SortArray extends Array{

	public SortArray(int len) {
		super(len);  //父类没有无参构造，明确调用有参构造
	}
	
	//覆写方法实现排序
	public int[] getData(){  //获得排序结果
		java.util.Arrays.sort(super.getData());  //调用java系统中排序方法进行排序
		return super.getData();
	}
	
}
