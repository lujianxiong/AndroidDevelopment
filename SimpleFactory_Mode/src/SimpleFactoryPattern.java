
public class SimpleFactoryPattern {
	public static void main(String[] args) {
//ProductFactory类使用if控制
		ProductFactory factory = new ProductFactory();
		factory.Creat("A").show();
		factory.Creat("B").show();
		factory.Creat("C").show();
		
//Factory类使用switch控制
//		Factory factory = new ProductFactory();
//		factory.Manufacture("A").show();
//		factory.Manufacture("B").show();
//		factory.Manufacture("C").show();


		

	}

}
