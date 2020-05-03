package 属性覆盖;
//第七节 属性覆盖：
public class DatabaseChannel extends Channel{  //要进行数据库的连接
	String info = "HelloWorld";   //名称相同的属性info
	public void fun(){  
		//System.out.println(super.info);   //这里super能调用父类的属性是因为父类属性没有被封装
		System.out.println(this.info);   
		
		//假设父类属性被封装
		System.out.println(super.getinfo());   

	}
}
