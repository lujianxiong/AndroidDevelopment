package policy;
//横切刀片
public class HoriBlade implements ICutFruit {

	public void CutStrategy(String fruitname) {
		System.out.println(fruitname+"一次被切成几个横片");
	}
}
