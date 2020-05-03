package 学生类继承实例;
//第二十节 学生类继承实例（继承、覆写）：
public class Student extends Person{
	private double math;
	private double english;
	
	public Student(){}
	
	public Student(String name,String addr){
		super(name,addr);    //调用父类的双参构造
	}
	
	public Student(String name,String addr,char sex,int age,double math,double english){
		super(name,addr,sex,age);  //调用父类构造方法
		this.math = math;
		this.english = english;
	}
	
	public String getInfo(){
		return super.getInfo()+"、数学成绩:"+this.math+"、英语成绩:"+this.english;
	}
}
