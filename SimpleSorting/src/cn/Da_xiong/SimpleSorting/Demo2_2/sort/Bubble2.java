package cn.Da_xiong.algorithm.Demo2_2.sort;
//冒泡排序
//i++  j--
public class Bubble2 {
    //方法一：对数组a中的元素进行排序
    public static void sort(Comparable[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=a.length-1;j>0;j--){
                if(greater(a[j-1],a[j])){
                    exch(a,j,j-1);
                }
            }
        }
    }
    //方法二：比较v元素是否大于w元素
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    //方法三：数据元素i和j交换位置
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}
