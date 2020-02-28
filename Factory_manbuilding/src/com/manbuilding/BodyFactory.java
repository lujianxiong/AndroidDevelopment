package com.manbuilding;

public class BodyFactory extends AbstractHumanComponentFactory{
	@Override
	public Head getHead(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Body getBody(String type) {
		// TODO Auto-generated method stub
		if("black".equals(type)){
			return new BlackManBody();
		}
		if("yellow".equals(type)){
			return new YellowManBody();
		}
		return null;
	}

	@Override
	public Foot getFoot(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
