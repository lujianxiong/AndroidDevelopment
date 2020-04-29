import java.util.Hashtable;

public class MyFruitStore {
    //水果架    Hashtable里面放了很多原型，像一个池子一样
    private static Hashtable fruittable=new Hashtable<Integer,MyFruit>();
    public static void Add(Integer key, MyFruit fruit){
       //将水果放到货架上
        fruittable.put(key,fruit);
    }

    //从货架上取,通过货架号取
    public static MyFruit Get(Integer key) throws CloneNotSupportedException {
        MyFruit fruit = (MyFruit) fruittable.get(key); //get出来的是Object类型，需要强制转换
        return (MyFruit) fruit.clone();  //不能真把水果拿出去了，否则货架上就没有了，拿得是clone
    }
}
