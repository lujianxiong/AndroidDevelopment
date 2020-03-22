package state;

public class DeadState extends ThreadState {
	public DeadState(){
		state=StateSet.DEAD;
		System.out.println("Ïß³ÌËÀÍö");
	}

}
