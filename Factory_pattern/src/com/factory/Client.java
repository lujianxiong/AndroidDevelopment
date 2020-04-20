package com.factory;

public class Client {
	public static void main(String[] args) {
		//创建两个水果加工厂
		FactoryApple aFactory = new FactoryApple();
		FactoryBanana bFactory = new FactoryBanana();
		//显示加工信息
		aFactory.Creat().show();
		bFactory.Creat().show();

	}

}
