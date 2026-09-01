package com.itheima.Classexercise;

import java.util.Scanner;

public class Demo1 {
    static void main() {

        /*
        卡拉兹函数(Collatz function)定义如下:
        给定正整数n,若n为奇数,则f(n)=3n+1     若n为偶数,则f(n)=n/2
        示例1:
            输入:1
            说明:奇数,3*1+1=4
            输出:4
        示例2:
            输入:2
            说明:偶数,2 / 2 = 1
            输出:1
        */
//引入scanner类
        Scanner sc = new Scanner(System.in);
//定义一个变量存储输入的数字
        System.out.println("请输入一个正整数：");
        int n = sc.nextInt();
        if(n>=1 && n%2==0){
            System.out.println(n/2);
        }else if (n>=1 && n%2!=0){
            System.out.println(3*n+1);
        }
    }
}
