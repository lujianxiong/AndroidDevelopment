package ArchetypalModel;

import AbstractFactory.Factory;
import AbstractFactory.Milk;
import AbstractFactory.Tea;

public abstract class MilkTeaBuilder {
    public String name;
	public Milk milk;
	public Tea tea;
	public Factory cloneFactory;
	public abstract void buildMilk();
	public abstract void buildTea();
	public abstract void create();
	/**
	 * 打开仓库的门，按照工厂的序号取原料
	 */
	public Factory openDoor(int factorId) {
		FactoryCache.loadCache();
		if(factorId==1) {
			cloneFactory=(Factory) FactoryCache.getFactory("1");
		}
		else {
			cloneFactory=(Factory) FactoryCache.getFactory("2");
		}
		return cloneFactory;
	}
}
