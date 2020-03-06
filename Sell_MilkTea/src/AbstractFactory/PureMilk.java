package AbstractFactory;

public class PureMilk implements Milk{
	PureMilk(){
		System.out.print("加纯牛奶");
	}
	@Override
	public String getMilk(){
		String string="在搅拌机里加纯牛奶";
		return string;
	}

}
