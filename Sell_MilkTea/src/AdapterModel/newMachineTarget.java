package AdapterModel;

import AbstractFactory.Milk;
import AbstractFactory.Tea;

public interface newMachineTarget {
//MilkMachine相当于Adaptee即原有的旧机器
	public void newmaking(Milk milk,Tea tea);
	
}
