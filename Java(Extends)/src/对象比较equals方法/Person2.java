package 对象比较equals方法;
//第十九节 对象比较（equals方法）
//观察Object类中的equals方法覆写
public class Person2 {
	String name;
	int age;
	
	public Person2(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	@Override 
	public String toString(){
		return "姓名："+this.name+"、年龄："+this.age;
	}
	
	//覆写Object类中的equals方法
	@SuppressWarnings("unused")
	@Override
	//equals()方法这时候会有两个对象，当前对象this，传入的Object
	 public boolean equals(Object obj) {
		//1. 传入的对象不是Person2类的实例
		if(!(obj instanceof Person2)){
			return false;
		}
		//2. obj为null的情况
		if(obj == null){  //加if语句判断空的情况能保证程序不出错。
			return false;
		}
		//3. 同一个对象的情况，就不需要进行判断了
		if(this == obj){  
			return  true;
		}
		//4. 正常情况实现比较
		//原始的Object类型中不包含name，age属性
		//因此必须向下强制转型找到这两个属性
		Person2 per = (Person2)obj;   //目的是为了获取类中的属性
	    return this.name.equals(per.name) && this.age == per.age;
	}
	
}
