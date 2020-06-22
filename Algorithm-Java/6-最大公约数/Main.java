package com.gavin;

// 【Link】https://www.cnblogs.com/tonylp/archive/2013/03/20/2971272.html
// Created by Gavin, 2020-06-22
// Modified by Gavin, 2020-06-22

import java.util.Scanner;

public class Main {
    // 主函数
    public static void main(String[] args) {
        // 输入整数
        Scanner scan = new Scanner(System.in);
        System.out.println("辗转相除法，请输入第一个整数：");
        int num1 = scan.nextInt();
        System.out.println("辗转相除法，请输入第二个整数：");
        int num2 = scan.nextInt();
        System.out.println("num1=" + num1 + ";num2=" + num2);
        // 备用数字
        int first = num1;
        int second = num2;

        // 辗转相除法：输入两个正整数m和n，求其最大公约数和最小公倍数
        // 两个数交换，使第一个数大于第二个
        int temp;
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        while (num2 != 0) {
            temp = num1 % num2;
            num1 = num2;
            num2 = temp;
            // 输出每次迭代后num1， num2的值
            System.out.println(num1);
            System.out.println(num2);
        }
        // 输出最后的结果
        System.out.println("最大公因数为：" + num1);
        System.out.println("最小公倍数为：" + first * second / num1);
    }
}
