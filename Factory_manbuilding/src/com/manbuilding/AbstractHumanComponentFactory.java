package com.manbuilding;

public abstract class AbstractHumanComponentFactory {
	public abstract Head getHead(String type);
	public abstract Body getBody(String type);
	public abstract Foot getFoot(String type);
	
}
