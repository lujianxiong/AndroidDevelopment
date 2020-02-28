package com.manbuilding;

public class HumanDirector {
	private Builder builder;
	public void setBuilder(Builder builder){
		this.builder=builder;
	}
	public HumanDirector(){
		super();
	}
	public HumanDirector(Builder builder){
		super();
		this.builder=builder;
	}
	// 只负责构建不负责返回
	public void construct(){
		builder.buildHead();
		builder.buildBody();
		builder.buildFoot();
}
}
