package com.gavin;

//【link】https://www.cnblogs.com/tonylp/archive/2013/03/20/2971272.html
// Created by Gavin, 2020-06-29
// Modified by Gavin, 2020-06-29

import java.util.Scanner;


// 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 1.程序分析：利用while语句,条件为输入的字符不为'\n'.
// 类定义
public class Main {

    // 主函数
    public static void main(String[] args) {
        //定义计数器
        int abcCount=0;
        int spaceCount=0;
        int numCount=0;
        int otherCount=0;

        // 输入字符串
        System.out.println("请输入字符串，按Enter键结束：");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();

        // 分类统计
        for (int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                numCount++;
            }else if (Character.isSpaceChar(ch[i])){
                spaceCount++;
            }else if(Character.isLetter(ch[i])){
                abcCount++;
            }else {
                otherCount++;
            }
        }

        // 输出结果
        System.out.println("您输入的字符串为："+str);
        System.out.println("字符串长度为："+str.length());
        System.out.println("字母个数为："+abcCount);
        System.out.println("数字个数为："+numCount);
        System.out.println("空格个数为："+spaceCount);
        System.out.println("其他字符个数为："+otherCount);

    }
}