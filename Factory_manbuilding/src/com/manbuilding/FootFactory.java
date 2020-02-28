package com.manbuilding;

public class FootFactory extends AbstractHumanComponentFactory{

	@Override
	public Head getHead(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Body getBody(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Foot getFoot(String type) {
		// TODO Auto-generated method stub
		if("black".equals(type)){
			return new BlackManFoot();
		}
		if("yellow".equals(type)){
			return new YellowManFoot();
		}
		return null;
	}

}
