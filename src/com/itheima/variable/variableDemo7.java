package com.itheima.variable;

import java.util.Scanner;

public class variableDemo7 {
    static void main() {
//        引入scanner打工人
        Scanner sc = new Scanner(System.in);
//        BMI=体重除以身高的平方
//键盘录入体重 KG 60
        System.out.println("请输入体重");
        double weight = sc.nextDouble();

//        键盘录入身高 M 1.77
        System.out.println("请输入身高");
        double height = sc.nextDouble();

//        计算BMI
        double bmi = weight / (height * height);
        System.out.println(bmi);
    }
}
