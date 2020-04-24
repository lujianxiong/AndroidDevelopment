package ObjectArray;
//第10节 对象数组
//对象数组的动态初始化
public class Dynamic_initialization {

	public static void main(String[] args) {
		Person pr []=new Person [3];  //对象数组
		pr[0]=new Person("张三",20);
		pr[1]=new Person("李四",11);
		pr[2]=new Person("王五",33);
		for(int i=0;i<pr.length;i++){
			System.out.println(pr[i].getInfo());
		}
	}

}
