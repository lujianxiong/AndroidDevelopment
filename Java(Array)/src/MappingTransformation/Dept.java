package MappingTransformation;
//部门实体表映射
public class Dept {
	private long deptno;   //部门编号
	private String dname;    //部门名称 
	private String loc;     //部门位置
	//设置两个类之间的引用关系
	private Emp emps [];     //一个部门有多个雇员
	
	public Dept(long deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	//setter、getter、无参构造 略
	
	public void setEmps(Emp [] emps){
		this.emps = emps;
	}
	public Emp [] getEmps(){
		return this.emps;
	}
	
	public String getInfo(){
		return "【部门信息】 部门编号 = "+this.deptno+"、部门名称 = "+this.dname+"、部门位置 = "+this.loc;
	}

}
