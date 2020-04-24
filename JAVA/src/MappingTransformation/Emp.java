package MappingTransformation;
//雇员实体表映射
public class Emp {
	 private long mgrno;    //雇员编号
	 private String ename;    //雇员姓名
	 private String job;     //雇员职位
	 private double sal;     //基本工资 
	 private double comn;    //佣金
	 //设置两个类之间的引用关系
	 private Dept dept;    //一个雇员属于一个部门
	 private Emp mgr;      //一个雇员有一个领导
	public Emp(long mgrno, String ename, String job, double sal, double comn) {
		this.mgrno = mgrno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comn = comn;
	}
	//setter、getter、无参构造 略
	
	public String getInfo(){
		return "【雇员信息】 雇员编号 = "+this.mgrno+"、雇员姓名 = "+this.ename+"、雇员职位 = "+this.job+"、基本工资 = "+this.sal+"、佣金 = "+this.comn;
	}
	
	public void setDept(Dept dept){
		this.dept=dept;
	}
	public void setEmp(Emp mgr){
		this.mgr=mgr;
	}
	public Dept getDept(){
		return dept;
	}
	public Emp getEmp(){
		return mgr;
	}
	
	 

}
