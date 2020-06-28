package com.gavin;

//【link】https://zhuanlan.zhihu.com/p/85966716
//【算法分析】https://blog.csdn.net/u010425839/article/details/106415486/
// Created by Gavin, 2020-06-28
// Modified by Gavin, 2020-06-28

//import java.util.Scanner;

import java.util.Arrays;

// 快速排序算法：递归方式实现
// 类定义
public class Main {

    // 主函数
    public static void main(String[] args) {
        //给出无序数组
        int arr[] = {10, 6, 3, 8, 33, 27, 66, 9, 7, 88};

        //输出原始的无序数组
        System.out.println("原数组为：");
        System.out.println(Arrays.toString(arr));
        System.out.println("数组长度为：" + arr.length);

        //调用冒泡排序算法
        bubbleSot(arr);
        System.out.println("冒泡排序之后的数组为：" + Arrays.toString(arr));

    }

    public static void bubbleSot(int arr[]){
        int temp;
        // 外循环
        for(int i=0;i<arr.length-1;i++){
            // 内循环：对数组长度-i位数据进行排序
            for(int j=0;j<arr.length-i-1;j++){
                // 如果后一位比前一位小，交换后一位和前一位
                if(arr[j+1]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}