package AbstractFactory;

public class GreenTea implements Tea{
	public GreenTea(){
    	System.out.print("加绿茶");
	}
    	@Override
	public String getTea() {
		String string="在烤茶机里加绿茶";
		return string;
	}
}
