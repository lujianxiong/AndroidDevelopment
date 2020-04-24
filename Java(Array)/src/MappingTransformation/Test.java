package MappingTransformation;

public class Test {

	public static void main(String[] args) {
		//第一步：根据关系进行类的定义初始化
		//定义出各个实例化对象，此时并没有任何关联定义
		Dept dept = new Dept(10,"财务部","上海");
		Emp empA = new Emp(7369L,"SMITH","CLERK",800.00,0.0);   //clerk是雇员
		Emp empB = new Emp(7369L,"DORD","MANAGER",2450.00,0.0);    //manager是管理者
		Emp empC = new Emp(7369L,"KING","PRESIDENT",5000.00,0.0);    //president是总经理、总裁
		
		//为对象进行关联的设置
		empA.setDept(dept);    //设置雇员与部门的关联（A雇员是dept部门的）
		empB.setDept(dept);    //设置雇员与部门的关联（B雇员是dept部门的）
		empC.setDept(dept);    //设置雇员与部门的关联（C雇员是dept部门的）
		empA.setEmp(empB);     //设置雇员与部门的关联（A的上司是B）
		empB.setEmp(empC);     //设置雇员与部门的关联（B的上司是C）
		dept.setEmps(new Emp []{empA,empB,empC});   //部门里有多个部员：A、B、C
		
		//第二步：根据关系获取数据
		System.out.println(dept.getInfo());    //打印部门信息
		for(int i=0;i<dept.getEmps().length;i++){
			System.out.println("\t|- "+dept.getEmps()[i].getInfo());   //打印部员的详细信息
			
			if(dept.getEmps()[i].getEmp()!=null){  //只有两个人有领导
			System.out.println("\t\t|- "+dept.getEmps()[i].getEmp().getInfo());   //打印部员的领导
			}
		}
		
		System.out.println("-------------------------------------------");
		System.out.println(empA.getDept().getInfo());    //根据部员获取部门信息
		System.out.println(empA.getEmp().getInfo());     //根据部员获取领导信息
	}
}
