package com.gavin;

//【link】https://www.cnblogs.com/tonylp/archive/2013/03/20/2971272.html
// Created by Gavin, 2020-07-01
// Modified by Gavin, 2020-07-01

import java.util.Scanner;

// 题目21：求1+2!+3!+...+20!的和
// 类定义
public class Main {
    // 主函数
    public static void main(String[] args) {
        // 输入一个整数
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数（建议30以内，大了long会溢出），对该数进行阶乘运算：");
        int num = scan.nextInt();

        // int sum = 0;
        // 输入20，结果为：-1924793831，位数不够
        long sum=0;
        int multiply = 1;
        for (int i = 1; i < num; i++) {
            multiply = multiply * i;
            sum += multiply;
        }

        System.out.println("最后结果为：" + sum);
        // 输入20，最后结果为：6665140761
    }
}