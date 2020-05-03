package 数组操作;
//第二十三节 数组操作：
public class demo {
	public static void main(String[] args) {
		ReverseArray arr = new ReverseArray(5);
		System.out.println(arr.add(10));
		System.out.println(arr.add(5));
		System.out.println(arr.add(20));
		System.out.println(arr.add(3));
		System.out.println(arr.add(6));
		arr.increment(3);
		System.out.println(arr.add(1));
		System.out.println(arr.add(7));
		System.out.println(arr.add(0));
		int result[] = arr.getData();
		for(int temp:result){
			System.out.print(temp+"、");
		}
	}

}
