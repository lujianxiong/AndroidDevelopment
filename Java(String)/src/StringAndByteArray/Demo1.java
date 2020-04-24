package StringAndByteArray;
//第十节：字符串与字节数组
public class Demo1 {
	public static void main(String[] args) {
		String str = "helloworld";
		//使用普通方法：getBytes()将字符串转换为字节数组
		byte data[] = str.getBytes();
		for(int i=0;i<data.length;i++){
			data[i]-=32;
		}
		System.out.println(new String(data));
		System.out.println(new String(data,0,5));
	}

}
