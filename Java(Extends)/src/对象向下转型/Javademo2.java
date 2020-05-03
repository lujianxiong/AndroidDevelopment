package 对象向下转型;
//第十五节 对象向下转型：
//观察一个错误的程序
public class Javademo2 {
	public static void main(String[] args) {
		System.out.println("----------正常状态下的超人应该是一个普通人的状态-----------");
		Person per = new Person();     //不向上转型
		per.print();
		System.out.println("------------外形怪兽狗骚扰地球，准备消灭人类-------------");
		SuperMan man = (SuperMan)per;    //向下转型 （会报错）
		System.out.println(man.fly());  //飞不起来
		System.out.println(man.fire());  //喷不出火
	}

}
