package AbstractFactory;

public class RedTea implements Tea{
	public RedTea()	{
		System.out.print("加红茶");
	}
    	@Override
	public String getTea() {
		String string="在烤茶机里加红茶";
		return string;
	}
}
