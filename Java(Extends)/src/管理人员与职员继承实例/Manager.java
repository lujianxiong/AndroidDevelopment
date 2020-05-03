package 管理人员与职员继承实例;
//第二十一节 管理人员与职员继承实例：
//管理层类
public class Manager extends Employee{
	private String position;
	private double salary;
	
	public Manager(){}
	
	public Manager(String name,int age,char sex,String position,double salary){
		super(name,age,sex);
		this.position = position;
		this.salary = salary;
	}
	
	public String getInfo(){
		return "【管理层】:"+super.getInfo()+"、职位 = "+this.position+"、年薪 = "+this.salary;
	}
}
