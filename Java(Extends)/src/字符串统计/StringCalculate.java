package 字符串统计;
//第二十二节 字符串统计：
//定义一个单独的处理类
public class StringCalculate {
	//返回的第一个内容为字母n的个数，第二个内容为字母o的个数
	public static int[] count(String str){
		int countData [] = new int [2];
		char[] data = str.toCharArray();   //将字符串变为字符数组
		for(int x=0;x<data.length;x++){
			if(data[x] == 'n'|| data[x] == 'N'){
				countData[0]++;
			}
			if(data[x] == 'o'|| data[x] == 'O'){
				countData[1]++;
			}
		}
		return countData;
	}
}
