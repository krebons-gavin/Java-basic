package com.gavin;

// 【Link】https://www.cnblogs.com/tonylp/archive/2013/03/20/2971272.html
// Created by Gavin, 2020-06-15
// Modified by Gavin, 2020-06-15

public class Main {
    public static final int MONTH = 15;

    public static void main(String[] args) {
        // Fibonacci示例
        // TODO Auto-generated method stub
        long f1 = 1L, f2 = 1L;
        long f;
        for (int i = 3; i < MONTH; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            System.out.println("第" + i + "个月的兔子对数：" + f2);
        }
        /*
        for(int i =1 ; i<MONTH; i++){
            System.out.println("第"+i+"个月的兔子对数："+fib(i));
        }
        */
    }

    //递归方法实现
    public static int fib(int month){
        if(month == 1 || month == 2){
            return 1;
        }else{
            return fib(month-1)+fib(month-2);
        }
    }
}
