package com.game;

public class factory1 implements gameFactory {

	@Override
	public gameRule newRule() {
		System.out.println("角色1创建成功！！");
		return new Rule1();
		
	}

}
