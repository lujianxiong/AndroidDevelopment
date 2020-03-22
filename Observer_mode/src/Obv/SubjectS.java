package Obv;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectS {
	protected List <Observer0> observers;
	public SubjectS(){            //构造方法：new一个目标数组
		observers=new ArrayList<Observer0>();
		//ArrayList是动态数组，简单地说就是Array的复杂版本，
		//它提供了动态的增加和减少元素，实现了ICollection和IList接口，灵活的设置数组的大小等好处
	}
	public void Add(Observer0 observer){
		observers.add(observer);      //增加目标者
	}
	public void Remove(Observer0 observer){
		observers.remove(observer);    
	}
	public abstract void notifyObserver();
}
