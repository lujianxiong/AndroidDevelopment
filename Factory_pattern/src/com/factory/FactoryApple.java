package com.factory;

public class FactoryApple implements FruitFactory {
    //Apple工厂创建Apple
	public Fruit Creat() {
		return new Apple();
	}

}
