package com.gavin;

// 【Link】https://baijiahao.baidu.com/s?id=1660860926822264664&wfr=spider&for=pc
// Created by Gavin, 2020-06-16
// Modified by Gavin, 2020-06-16

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // java输入整数，求各位数之和
        // 输入一个数字
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scan.nextInt();

        int sum = 0; // 累加变量
        while (num > 0) {
            // 将当前数字的个位数取出累加
            sum += num % 10; // 余数除法
            // 将当前数字除以10，以便下个循环使用
            num = num / 10;
        }
        System.out.println("最终结果为：" + sum);
    }
}
