package com.itheima.variable;

import java.util.Scanner;

public class variableDemo6 {
    static void main() {

//        引进scanner这个打工人
        Scanner sc = new Scanner(System.in);
//        定义两个整数类型的变量num1和num2,键盘录入数据分别为两个变量赋值。
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println(num1);
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.println(num2);
//        求两个数的和并进行打印。
        int sum = num1 + num2;
        System.out.println("两个数的和为：" + sum);




    }
}
