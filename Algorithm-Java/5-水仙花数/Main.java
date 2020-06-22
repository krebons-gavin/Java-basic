package com.gavin;

// 【Link】https://www.cnblogs.com/tonylp/archive/2013/03/20/2971272.html
// Created by Gavin, 2020-06-22
// Modified by Gavin, 2020-06-22

// import java.util.Scanner;

public class Main {
    // 主函数
    public static void main(String[] args) {
        // 输入整数
        // Scanner scan=new Scanner(System.in);
        // System.out.println("水仙花数，请输入一个大于100小于1000的整数：");
        //int NUM=scan.nextInt();

        // 水仙花数：一个三位数，其各位数字立方和等于该数本身。
        // Find Daffodil Number
        int a, b, c;
        int number;
        for(int i=100;i<999;i++){
            a=i/100;
            b=(i-a*100)/10;
            c=i-a*100-b*10;
            number=a*a*a+b*b*b+c*c*c;
            if(number==i){
                System.out.println("水仙花数："+i);
            }
        }

        // 结果：153，370，371，407
    }
}
