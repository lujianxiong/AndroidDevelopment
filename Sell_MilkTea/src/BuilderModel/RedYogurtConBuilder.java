package BuilderModel;

import AdapterModel.Adapter;
import AdapterModel.newMachineTarget;
import ArchetypalModel.MilkTeaBuilder;

public class RedYogurtConBuilder extends MilkTeaBuilder{
	@Override
	public void buildMilk() {
		openDoor(2);
		milk=cloneFactory.CreateMilk();
		System.out.println("Factory: " + cloneFactory);
	}
	@Override
	public void buildTea() {
		openDoor(2);
		tea=cloneFactory.CreateTea();
		System.out.println("Factory: " + cloneFactory);
	}
	@Override
	public void create() {
		System.out.println("正在开始准备酸奶红茶中......");	
		//MilkMachine.makingMilk(milk);
		//TeaMachine.makingTea(tea);
		newMachineTarget machine=new Adapter();
		machine.newmaking(milk,tea);//用新机器加工
	}
}
