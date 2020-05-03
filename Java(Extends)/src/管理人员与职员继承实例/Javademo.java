package 管理人员与职员继承实例;
//第二十一节 管理人员与职员继承实例：
public class Javademo {
	public static void main(String[] args) {
		Manager man = new Manager("张三",38,'女' ,"主管",150000.00);
		Staff sta = new Staff("李四",18,'男' ,"出纳",3000.00);
		System.out.println(man.getInfo());
		System.out.println(sta.getInfo());
		
	}

}
