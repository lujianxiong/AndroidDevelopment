package MethodVariableParameter;

public class ArrayUtil2 {
	public static int sum(int ... data){    //变种数组
		int sum=0;
		for(int temp : data){
			sum+=temp;
		}
		return sum;
	}

}
