package com.game;

public class factory2 implements gameFactory {

	@Override
	public gameRule newRule() {
		System.out.println("角色1创建成功！！");
	    return new Rule2(); 
	}

}
