package com.factory;

public class FactoryBanana implements FruitFactory {
	//Banana工厂创建Banana
	public Fruit Creat() {
		return new Banana();
	}

}
