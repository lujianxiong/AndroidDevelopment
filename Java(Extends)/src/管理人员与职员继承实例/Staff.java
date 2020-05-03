package 管理人员与职员继承实例;
//第二十一节 管理人员与职员继承实例：
//职员类
public class Staff extends Employee{
	private String department;
	private double salary;
	
	public Staff(){}
	
	public Staff(String name,int age,char sex,String department,double salary){
		super(name,age,sex);
		this.department = department;
		this.salary = salary;
	}
	
	public String getInfo(){
		return "【职员】:"+super.getInfo()+"、部门 = "+this.department+"、月薪 = "+this.salary;
	}

}
