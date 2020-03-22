package policy;
//小刀
public class FruitKnife implements ICutFruit {

	public void CutStrategy(String fruitname) {
		System.out.println(fruitname+"一次被切成一片");
	}
}
