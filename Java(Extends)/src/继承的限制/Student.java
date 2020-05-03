package 继承的限制;
//第四节：继承的限制
public class Student extends Person{
	public Student(String name){
		setName(name);   //设置name属性内容
	}
	public void fun(){
		//System.out.println(name);  //直接访问不可能，因为私有的属性
		System.out.println(getName());    //间接访问
	}
	
}
