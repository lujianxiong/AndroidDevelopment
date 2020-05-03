package Object类简介;
//第十七节 Object类简介：
//使用Object类接受数组(引用类型)
public class Javademo2 {
	public static void main(String[] args) {
		Object obj = new int[] {1,2,3};  //向上转型
		if(obj instanceof int[]){   //判断是否为整型数组
			int data [] = (int[])obj;  //向下转型
			for(int temp:data){
				System.out.print(temp+"、");
			}
		}
	}

}
