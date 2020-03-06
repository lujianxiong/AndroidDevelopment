package BuilderModel;

import AbstractFactory.Tea;

public class TeaMachine {
	public static void makingTea(Tea tea) {
		String makeString=tea.getTea();
		System.out.println(makeString);
	}
}
