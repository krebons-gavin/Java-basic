package com.gavin;

// 【link】https://www.cnblogs.com/tonylp/archive/2013/03/20/2971272.html
// Created By: Gavin, 2020-06-15
// Modified By: Gavin, 2020-06-15

public class Main {

    public static void main(String[] args) {
	// 9*9乘法口诀
        for (int i=1; i<=9; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t"); // 输出 j*i的结果并跳表
                // \t补全当前字符串长度到8的整数倍，最少1个最多8个空格
            }
            System.out.println("");  // 换行
        }
    }
}
