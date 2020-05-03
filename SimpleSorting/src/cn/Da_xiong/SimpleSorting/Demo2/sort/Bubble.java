package cn.Da_xiong.algorithm.Demo2.sort;
//冒泡排序 API  (顺序)
//i-- j++
public class Bubble {
    //方法一：对数组a中的元素进行排序
    public static void sort(Comparable[] a){
        //Comparable[] a:传入实现Comparable接口的类的数组
        //每冒泡一次，下一次冒泡比较的次数就-1
        for(int i=a.length-1;i>0;i--){
            //第一次for循环是控制冒泡次数
            //数组里有6个元素，冒泡5次就可以完成排序。索引是几就排几次
            //数组的最大索引i = 数组长度-1
            for(int j=0;j<i;j++){
                //第二次for循环是控制每次冒泡过程中相邻元素比较的次数
                //j是从索引为0的开始，到最大索引处（即i）
                //比较索引j和索引j+1处的值；若j的值大于j+1的值，就交换位置
                if(greater(a[j],a[j+1])){ //如果greater函数返回的值为true，说明v-w>0，即j处的值比j+1的值大
                    exch(a,j,j+1);  //使用exch方法交换j和j+1处的值
                }
            }
        }
    }
    //方法二：比较v元素是否大于w元素
    private static boolean greater(Comparable v,Comparable w){
        //Comparable中提供有一个方法：ComparableTo
        //ComparableTo返回的是int类型的结果
        //判断v-w是否比0大，如果大就是true，小就false
        return v.compareTo(w)>0;
    }
    //方法三：数据元素i和j交换位置
    private static void exch(Comparable[] a,int i,int j){
        //把i和j数据互换
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}
