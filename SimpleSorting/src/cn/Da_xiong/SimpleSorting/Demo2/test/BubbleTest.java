package cn.Da_xiong.algorithm.Demo2.test;
//冒泡排序
import cn.Da_xiong.algorithm.Demo2.sort.Bubble;
import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {4,5,6,3,2,1};
        Bubble.sort(arr);
        //int[] arr = {4,5,6,3,2,1};这里如果使用这个会报错
        //是因为上面使用的是int类型的数据，修改为Integer就可以(Integer数据类型继承了Comparable接口)
        //System.out.println(arr.toString());   这样使用不对，会报错
        System.out.println(Arrays.toString(arr));
    }
}
