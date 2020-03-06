package AdapterModel;

import AbstractFactory.Milk;
import AbstractFactory.Tea;
import BuilderModel.MilkMachine;

public class Adapter extends MilkMachine implements newMachineTarget{
	public void newmaking(Milk milk,Tea tea) {
		makingMilk(milk);
		
		//新加的烤茶功能
		String makeString=tea.getTea();
		System.out.println(makeString);
	}
}
