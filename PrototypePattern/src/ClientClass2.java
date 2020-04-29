public class ClientClass2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyFruit fruit1 = new Apple();
        MyFruit fruit2 = new Banana();
        //MyFruitStore里面相当于放了很多原型

        MyFruitStore.Add(1,fruit1);
        MyFruitStore.Add(2,fruit2);
        MyFruitStore.Add(3,new Apple());
        MyFruitStore.Add(4,new Banana());

        //上面的代码一般用的时候启动的时候就都准备好了
        //用的时候直接去取
        MyFruit f1= (MyFruit) MyFruitStore.Get(3);
        f1.Display();
        MyFruit f2 = (MyFruit) MyFruitStore.Get(4);
        f2.Display();
    }
}
