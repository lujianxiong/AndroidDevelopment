package ArrayLibrarySupport;

public class ArrayCopy {

	public static void main(String[] args) {
		int dataA [] = new int [] {1,2,3,4,5,6,7,8,9};
		int dataB [] = new int [] {11,22,33,44,55,66,77,88,99};
		System.out.print("源数组：");
		ArrayUtil.printArray(dataA);
		System.out.print("目标数组：");
		ArrayUtil.printArray(dataB); 
		ArrayUtil.arraycopy(dataA, 4, dataB, 4, 3);  //自定义的方法，与java自带的实现相同的效果
		//System.arraycopy(dataA, 4, dataB, 4, 3);    java系统自带的方法
		System.out.print("从源数组拷贝的第五个数开始拷贝3个数到目标数组第五个数：");
		ArrayUtil.printArray(dataB);
		

	}

}
