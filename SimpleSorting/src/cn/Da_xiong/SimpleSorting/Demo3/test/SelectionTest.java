package cn.Da_xiong.algorithm.Demo3.test;
//选择排序
import cn.Da_xiong.algorithm.Demo3.sort.Selection;
import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        //原始数据
        Integer[] a= {4,6,8,9,2,10,1};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
