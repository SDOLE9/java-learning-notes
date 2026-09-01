package com.itheima.Classexercise;

import java.util.Scanner;

public class Demo2 {
    static void main() {
        /*
        noob25 牛妹数
        题目描述:如果一个整数是偶数且大于50,我们称其为牛妹数。给定一个整数n,判断其是否为牛妹数。
        输入:1≦n≦100
        输出:是牛妹数输出yes,否则输出no。
        示例1: 输入50 → 输出no (50是偶数但不大于50)
        示例2: 输入52 → 输出yes
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n = sc.nextInt();
        if (n<1 || n>100){
            System.out.println("请重新运行，输入的整数需在1-100之间");
        }
            if (n>=1 && n<=100){
                if(n%2==0 && n>50){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
    }
}
