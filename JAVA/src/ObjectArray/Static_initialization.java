package ObjectArray;
//第10节 对象数组
//对象数组的静态初始化
public class Static_initialization {

	public static void main(String[] args) {
		Person pr []=new Person []{
			new Person("张三",20),
			new Person("李四",11),
			new Person("王五",33)
		};  //静态初始化对象数组
	
		for(int i=0;i<pr.length;i++){
			System.out.println(pr[i].getInfo());
		}
	}
}
