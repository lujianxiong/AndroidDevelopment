public class ClientClass{
    public static void main(String[] args) throws CloneNotSupportedException {
        MyFruit fruit1 = new Apple();
        MyFruit fruit2 = (MyFruit) fruit1.clone();
        MyFruit fruit3 = fruit1;
        fruit1.Display();
        fruit2.Display();
        fruit3.Display();

        System.out.println("fruit1的哈希值:"+fruit1.hashCode());   //第一个是new的
        System.out.println("fruit2的哈希值:"+fruit2.hashCode());   //第二个是clone的，地址不一样
        System.out.println("fruit3的哈希值:"+fruit3.hashCode());   //第三个是引用第一个，地址与第一个相同
        System.out.println(fruit1 == fruit2);
        System.out.println(fruit1.equals(fruit2));
        ////这里其实也可以用toString
        //System.out.println("fruit1:"+fruit1.toString());
        //System.out.println("fruit2:"+fruit2.toString());
        //System.out.println("fruit3:"+fruit3.toString());

    }
}
