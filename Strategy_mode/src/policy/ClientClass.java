package policy;

public class ClientClass {

	public static void main(String[] args) {
		Chef chef=new Chef();
		ICutFruit cut=new HoriBlade();
		chef.SetCutMethod(cut);
		chef.CutFruit("Æ»¹û");
	}
}
