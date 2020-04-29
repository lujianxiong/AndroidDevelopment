public class MyFruit implements  Cloneable{
    protected  String kind;

    public void Display(){
        System.out.println(kind);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    ////等同于上面的代码
    //public Object clone(){
    //    Object obj = null;
    //    try{
    //        obj = super.clone();
    //    }catch(CloneNotSupportedException e){
    //        e.printStackTrace;
    //    }
    //    return obj;
    //}

}
