package BuilderModel;

import AbstractFactory.Milk;

public class MilkMachine {
	public static void makingMilk(Milk milk) {
		String makeString=milk.getMilk();
		System.out.println(makeString);
	}
}
