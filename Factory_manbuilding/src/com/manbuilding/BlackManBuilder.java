package com.manbuilding;

public class BlackManBuilder extends Builder{
	private Human blackMan=new Human();
	private FactoryProducer factoryProducer=new FactoryProducer();
	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		//这里通过上面实行的抽象工厂来获得部件
		AbstractHumanComponentFactory HeadFactory = factoryProducer.getFactory("head");
		blackMan.setHead(HeadFactory.getHead("black"));
	}
	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		AbstractHumanComponentFactory BodyFactory = factoryProducer.getFactory("body");
		blackMan.setBody(BodyFactory.getBody("black"));

	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		AbstractHumanComponentFactory footFactory = factoryProducer.getFactory("foot");
		blackMan.setBody(footFactory.getBody("yellow"));
	}

	@Override
	public Human getHuman() {
		// TODO Auto-generated method stub
		return this.blackMan;
	}

	}

