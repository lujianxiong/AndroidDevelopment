package StringAndCharArray;
//第九节：字符串与字符数组：判断某一个字符串中的数据是否全部由数字组成
public class demo3 {
	public static void main(String[] args) {
		String str = "heloworld";
		System.out.println(isNumber(str)? str+"由数字组成":str+"不是由数字组成");
		System.out.println(isNumber("123")? "123"+"由数字组成":"123"+"不是由数字组成");

	}

	//判断字符串是否由数字所组成
	public static boolean isNumber(String str){
		//is开头的方法往往返回的都是bool值
		char[] result = str.toCharArray(); //将字符串变为字符数组
		for(int i =0;i<result.length;i++){//依次判断
			//这个是单引号,因为是单个字符
			if(result[i]<'0' || result[i]>'9'){
				return false;
			}
		}
		return true;
		
	}
}
