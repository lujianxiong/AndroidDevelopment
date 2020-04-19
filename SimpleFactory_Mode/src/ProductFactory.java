
public class ProductFactory {
	public static Product Creat(String ProductName){
		//工厂类里用if语句控制生产哪种商品；
		if("A".equals(ProductName))
			return new ProductA();
		if("B".equals(ProductName))
			return new ProductB();
		if("C".equals(ProductName))
			return new ProductC();
		return null;
	}

}
