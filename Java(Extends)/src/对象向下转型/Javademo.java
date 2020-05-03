package 对象向下转型;
//第十五节 对象向下转型：
public class Javademo {
	public static void main(String[] args) {
		System.out.println("----------正常状态下的超人应该是一个普通人的状态-----------");
		Person per = new SuperMan();     //向上转型
		per.print();
		System.out.println("------------外形怪兽狗骚扰地球，准备消灭人类-------------");
		SuperMan man = (SuperMan)per;    //向下转型 (光是人打不过，需要变身超人)
		System.out.println(man.fly());  //先飞起来
		System.out.println(man.fire());  //喷火

	}

}
