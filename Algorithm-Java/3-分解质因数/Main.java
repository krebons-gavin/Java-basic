package com.gavin;

// 【Link】https://www.cnblogs.com/tonylp/archive/2013/03/20/2971272.html
// Created by Gavin, 2020-06-16
// Modified by Gavin, 2020-06-16

import java.util.Scanner;

public class Main {
    // public static final int NUM = 130;
    // final可以用在类、方法、变量上。
    // final用在类上，表明当前类它不能被继承，没有子类
    // final用在方法上，表明当前方法不能被override，不能被重写
    // final用在变量上，表明当前变量是一个终态的变量，是一个常量，这个变量的值一但被赋值后就不能被改变了。
    // 初始化：声明变量时直接赋值

    public static void main(String[] args) {
        // 输入整数
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个大于5小于500的整数：");
        int NUM=scan.nextInt();

        // 对整数进行因数分解
        // TODO Auto-generated method stub
        int k = 2;
        int num = NUM;
        System.out.print(num + "=");
        while (num > k) {
            if (num % k == 0) {
                System.out.print(k + "*");
                num = num / k;
            } else {
                k++;
            }
        }
        System.out.println(k);

        // print\println\printf的区别
        // print就是一般的标准输出，但是不换行
        // println和print基本没什么差别，就是最后会换行
        // printf主要是继承了C语言的printf的一些特性，可以进行格式化输出

    }
}
