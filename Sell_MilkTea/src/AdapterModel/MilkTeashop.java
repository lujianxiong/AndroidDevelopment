package AdapterModel;

import java.util.Scanner;
import ArchetypalModel.MilkTeaBuilder;
import BuilderModel.GreenMilkConBuilder;
import BuilderModel.GreenYogurtConBuilder;
import BuilderModel.RedMilkConBuilder;
import BuilderModel.RedYogurtConBuilder;

public class MilkTeashop {
	public void menu() {
		System.out.println("*******************MENU***********************");
		System.out.println("      1.RedMilk             2.GreenMilk       ");
		System.out.println("      3.RedYogurt           4.GreenYogurt     ");
		System.out.println("********************END***********************");
	}
	
	public void making(MilkTeaBuilder milkTea) {
		milkTea.buildMilk();
		milkTea.buildTea();
		milkTea.create();

	}
	
	public MilkTeaBuilder selectMilkTea() {
		MilkTeaBuilder milkTea=null;	
		Scanner s =new Scanner(System.in);
		System.out.print("ÇëÑ¡ÔñÄãµÄÒûÁÏ");
		int num=s.nextInt();
		switch (num) {
		case 1:
			milkTea=new RedMilkConBuilder();
			break;
		case 2:
			milkTea=new GreenMilkConBuilder();
			break;
		case 3:
			milkTea=new RedYogurtConBuilder();
			break;
		case 4:
			milkTea=new GreenYogurtConBuilder();
			break;
		default:
			System.out.println("ÊäÈë´íÎó£¡");
			break;
		}
		making(milkTea);
		return milkTea;
	}
}
