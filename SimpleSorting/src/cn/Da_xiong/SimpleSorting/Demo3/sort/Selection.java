package cn.Da_xiong.algorithm.Demo3.sort;
//选择排序
public class Selection {
    //对数据a中的元素排序
    public static void sort(Comparable[] a){
        //从当前索引处与其他每个索引处的值比较，比到倒数第二个就可以了
        //这里i为当前的索引位置下标
        for(int i=0;i<a.length-1;i++){
            // 这里i从0最大到n-2,其实就是遍历n-1次，也可以写成i<=a.length-2

            //定义一个变量 记录最小元素所在的索引，默认为参与选择排序的第一个元素所在的位置
            int minIndex = i;
            for(int j=i+1;j<a.length;j++){
                //j就是未排序到合适位置的所有元素的索引下标
                //比较最小索引minIndex处的值和j索引处的值
                //如果j索引处的值更小，就就将它的值传给a数组minIndex处
                if(greater(a[minIndex],a[j])){
                    minIndex = j;
                }

            }
            //一个for循环遍历完就找到了第一个最小的索引位置：minIndex
            //将最小元素索引minIndex处的值与索引i处的值进行交换
            exch(a,i,minIndex);
        }
    }

    //比较v元素是否大于w元素
    public static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }

    //数组元素i和j交换位置
    public static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
