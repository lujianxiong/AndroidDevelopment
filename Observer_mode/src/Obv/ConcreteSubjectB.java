package Obv;

public class ConcreteSubjectB extends SubjectS {

	public ConcreteSubjectB(){
		super();
	}
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("B目标发生改变了");
		for(Observer0 obs:observers){
			obs.response();
	}
	}
}

