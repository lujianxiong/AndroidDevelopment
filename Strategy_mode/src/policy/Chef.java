package policy;

public class Chef {
	private ICutFruit cutmethod;
	public void SetCutMethod(ICutFruit cutmethod){
		this.cutmethod=cutmethod;
	}
	public void CutFruit(String fruitname){
		cutmethod.CutStrategy(fruitname);
	}
}
