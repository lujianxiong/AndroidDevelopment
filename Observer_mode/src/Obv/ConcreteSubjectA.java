package Obv;

public class ConcreteSubjectA extends SubjectS {
	
	public ConcreteSubjectA(){
		super();
	}
	
	@Override
	public void notifyObserver() {
		System.out.println("A目标发生改变了");
		for(Observer0 obs:observers){
			obs.response();
		}

	}

}
