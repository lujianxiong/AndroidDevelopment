package MethodVariableParameter;

public class ArrayUtil {
	public static int sum(int [] data){
		int sum=0;
		for(int temp : data){
			sum+=temp;
		}
		return sum;
	}
}
