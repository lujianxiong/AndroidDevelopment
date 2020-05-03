package cn.Da_xiong.algorithm.Demo4.test;

import cn.Da_xiong.algorithm.Demo4.sort.Insertion;
import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a = {4,3,2,10,12,1,5,6};

        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
