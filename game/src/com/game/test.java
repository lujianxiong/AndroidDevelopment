package com.game;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gameFactory gamefactory=(gameFactory) javaUtil.getObject();
		gameRule a=gamefactory.newRule();
		a.create();

	}

}
