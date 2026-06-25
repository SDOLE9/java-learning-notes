package com.itheima.variable;

import java.util.Scanner;

public class variableDemo5 {
    static void main() {
//        找到scanner这个打工人
        Scanner sc = new Scanner(System.in);

//        键盘输入整数，输出整数
        int num1 =sc.nextInt();
        System.out.println(num1);

//        键盘输入小数，输出小数
        double num2 =sc.nextDouble();
        System.out.println(num2);

//        键盘输入文本，输出字符串
        String str =sc.next();
        System.out.println(str);
    }
}
