package com.itheima.operator;

import java.util.Scanner;

public class operatorDemo11 {
    static void main() {
//        引入scanner打工人
        Scanner sc = new Scanner(System.in);
//        练习2:键盘录入一个整数,判断这个数字是否不在1~10之间
//        输入一个整数
        System.out.println("请输入一个整数:");
        int a = sc.nextInt();
//        判断是否不在1~10之间
//        a<1  a>10 |来拼成判断条件   &与 两者都要满足 |或 两者有一个满足 !非 取反操作
        boolean result = a < 1 | a > 10;
        System.out.println(result);
    }
}
