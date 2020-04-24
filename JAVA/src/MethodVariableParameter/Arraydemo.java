package MethodVariableParameter;
//第9节 方法可变参数

public class Arraydemo {
	public static void main(String[] args) {
		System.out.println(ArrayUtil2.sum(1,2,3));   //方法可变参数
		System.out.println(ArrayUtil.sum(new int [] {1,2,3}));   //传统实现
	}

}
