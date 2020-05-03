package cn.Da_xiong.algorithm.Demo4.sort;
//插入排序
public class Insertion {
    //第一个函数：对数组a中的元素进行排序
    public static void sort(Comparable[] a){
        //第一个索引处元素默认排好了，从第二个开始比较，插入；因此i从1开始，一直比到数组索引最大处即a.length-1处.
        for(int i=1;i<a.length;i++){
            //从i处往前遍历，所以j=i；与前面每一个元素比较，直到前面元素小于当前元素
            //这里不能写成j>=0，若j=0，0索引处前面就没有数了，会报错，出现数组索引越界异常
            for(int j=i;j>0;j--){
                 //比较所以j处的值和索引j-1处的值，如果索引j-1处的值比索引j处的值大，则交换；
                // 若j-1处的值不大于j处的值，则找到合适的位置了，插入！退出循环！
                if(greater(a[j-1],a[j])){
                    exch(a,j-1,j);
                }else{
                    break;
                }
             }
        }
    }

    //第二个函数：比较元素v是否大于w
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }

    //第三个元素：数组元素i与j交换位置
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

