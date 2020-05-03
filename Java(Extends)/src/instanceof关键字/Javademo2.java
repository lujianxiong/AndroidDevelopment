package instanceof关键字;
//第十六节 instanceof关键字：
//进行向下转型前使用instanceof关键字进行判断
public class Javademo2 {
	public static void main(String[] args) {
		 Person per = new SuperMan();
		 if(per instanceof SuperMan){
			 SuperMan man = (SuperMan)per;
			 System.out.println(man.fly());
			 System.out.println(man.fire());
		 }

	}

}
