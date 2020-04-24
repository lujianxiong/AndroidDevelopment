package OtherMethods;
//实现首字母大写工具类（使用各种String类方法）
//此代码在日后实际开发中必定要使用的程序
public class StringUtil_demo5 {
	public static String initcap(String str){
		//static定义的方法可以通过类名直接调用，不用实例化对象
		if(str == null ||"".equals(str)){
			return str;
		}
		if(str.length() == 1){ //注意这里是length()
			return str.toUpperCase();
		}
		return str.substring(0, 1).toUpperCase()+str.substring(1);
	}

}
