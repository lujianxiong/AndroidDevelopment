package com.manbuilding;

public class YellowManBuilder extends Builder{
	private Human yellowMan=new Human();
	private FactoryProducer factoryProducer=new FactoryProducer();
	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		//这里通过上面实行的抽象工厂来获得部件
		AbstractHumanComponentFactory HeadFactory = factoryProducer.getFactory("head");
		yellowMan.setHead(HeadFactory.getHead("yellow"));
	}
	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		AbstractHumanComponentFactory bodyFactory = factoryProducer.getFactory("body");
		yellowMan.setBody(bodyFactory.getBody("yellow"));

	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		AbstractHumanComponentFactory footFactory = factoryProducer.getFactory("foot");
		yellowMan.setBody(footFactory.getBody("yellow"));
	}

	@Override
	public Human getHuman() {
		// TODO Auto-generated method stub
		return this.yellowMan;
	}

	
}
