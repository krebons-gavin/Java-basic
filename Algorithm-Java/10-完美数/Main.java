package com.gavin;

//【link】https://www.cnblogs.com/tonylp/archive/2013/03/20/2971272.html
// Created by Gavin, 2020-06-30
// Modified by Gavin, 2020-06-30

//import java.util.Scanner;

// 题目9：题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完数。
// 类定义
public class Main {

    // 主函数
    public static void main(String[] args) {
        System.out.println("输出100000以内的完数：");

        // https://www.cnblogs.com/stefaniee/p/10903406.html
        for (int i = 2; i < 100000; i++) {
            int sum = 0;  // 记录一个数的因子的和
            // 使用j<=i/2，而不是j<i，可以减少一半的计算量
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.println("完数：" + i);
            }
        }

        System.out.println("结束！");
        // 结果：6，28，496，8128
    }
}