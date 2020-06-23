package com.gavin;

// 【Link】https://www.cnblogs.com/yabushier/p/10394138.html
// 【算法分析】https://www.cnblogs.com/l199616j/p/10597245.html
// Created by Gavin, 2020-06-23
// Modified by Gavin, 2020-06-23

//import java.util.Scanner;
import java.util.Arrays;

// 快速排序算法：递归方式
public class Main {
    // 分区函数
    private static int partition(int[] arr, int low, int high) {
        int counter=1;
        //指定左指针i和右指针j
        int i = low;
        int j = high;

        //将第一个数作为基准值。挖坑
        int x = arr[low];

        //使用循环实现分区操作
        while (i < j) {
            //1.从右向左移动j，找到第一个小于基准值的值 arr[j]
            // 本例第一次迭代为：j=8, arr[8]=19
            while (arr[j] >= x && i < j) {
                j--;
            }
            System.out.println("i="+i+"; j="+j); // temp
            System.out.println("arr[j]="+arr[j]); // temp

            //2.将右侧找到小于基准数的值加入到左边的（坑）位置， 左指针i向中间移动一个位置,i++
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }

            //3.从左向右移动i，找到第一个大于等于基准值x的值 arr[i]
            while (arr[i] < x && i < j) {
                i++;
            }

            //4.将左侧找到的打印等于基准值的值加入到右边的坑中，右指针向中间移动一个位置 j--
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }

        //使用基准值填坑，这就是基准值的最终位置
        arr[i] = x;//arr[j] = y;
        //返回基准值的位置索引
        System.out.println("基准位置i=："+i); // temp
        System.out.println("a[i]="+arr[i]); // temp
        System.out.println("当前数组为："+Arrays.toString(arr)); // temp
        counter ++;
        System.out.println("分区函数调用次数："+counter);
        return i;
    }

    // 排序函数：调用分区函数
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            //分区操作，将一个数组分成两个分区，返回分区界限索引
            // 本例第一次迭代：index = i = 6
            int index = partition(arr, low, high);
            System.out.println("index="+index); // temp
            System.out.println("arr[index]="+arr[index]); // temp
            //递归调用排序函数：对左分区进行快排
            quickSort(arr, low, index - 1);
            //递归调用排序函数：对右分区进行快排
            quickSort(arr, index + 1, high);
        }
    }

    // 主函数
    public static void main(String[] args) {
        //给出无序数组
        int arr[] = {10, 6, 3, 8, 33, 27, 66, 9, 7, 88};
        int len=arr.length-1;

        //输出原始的无序数组
        System.out.println("原数组为：");
        System.out.println(Arrays.toString(arr));
        System.out.println("数组长度为："+arr.length);
        //调用快速排序算法
        quickSort(arr,0,len);
        //partition(arr,0,arr.length-1);
        //输出排序后的有序数组
        System.out.println("排序之后的数组为：");
        System.out.println(Arrays.toString(arr));
    }
}