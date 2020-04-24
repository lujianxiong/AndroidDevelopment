package MappingTransformation2;

public class Test {

	public static void main(String[] args) {
		//第一步：根据结构设置对象数据：
		Item item= new Item(1L,"图书");
		SubItem subitem [] = new SubItem [] {
				new SubItem(10L,"编程图书"),
				new SubItem(10L,"图形图像类图书"),
		};
		item.setSubitem(subitem);    //一个分类下有多个子分类
		for(int i=0;i<subitem.length;i++){
			subitem[i].setItem(item);
		}
		//第二部:根据要求获取数据
		System.out.println(item.getInfo());
		for(int i=0;i<item.getSubitem().length;i++){
			System.out.println("\t|-"+item.getSubitem()[i].getInfo());
		}

	}

}
