package AbstractFactory;

public class Yogurt implements Milk{
	public Yogurt(){
		System.out.print("加酸奶");
	}
    	@Override
	public String getMilk() {
		String string="在搅拌机里加酸奶";
		return string;
	}
}
