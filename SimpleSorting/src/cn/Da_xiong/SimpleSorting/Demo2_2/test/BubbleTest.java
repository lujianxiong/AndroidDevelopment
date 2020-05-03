package cn.Da_xiong.algorithm.Demo2_2.test;
//冒泡排序

import cn.Da_xiong.algorithm.Demo2.sort.Bubble;
import cn.Da_xiong.algorithm.Demo2_2.sort.Bubble2;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {4,5,6,3,2,1,99,87,53,23,9,10};
        Bubble2.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
