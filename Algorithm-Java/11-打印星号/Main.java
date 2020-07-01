package com.gavin;

//【link】https://www.cnblogs.com/tonylp/archive/2013/03/20/2971272.html
// Created by Gavin, 2020-07-01
// Modified by Gavin, 2020-07-01

//import java.util.Scanner;

// 题目19：打印出如下图案（菱形）
// 类定义
public class Main {

    // 主函数
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 6, 3, 1};
        // 打印前4行
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");  // 不换行，打印*
            }
            System.out.println("");  // 换行
        }

        // 打印后3行
        for (int i = 4; i < arr.length; i++) {
            for (int j = arr[i]; j < 8; j++) {
                System.out.print(" ");  // 不换行，打印空格
            }
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");  // 不换行，打印*
            }
            System.out.println("");  // 换行
        }
    }
}