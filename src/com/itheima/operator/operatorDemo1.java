package com.itheima.operator;

public class operatorDemo1 {
    static void main() {

        /*
        演示算数运算符：+ - * / %

        整数计算，小数计算

        */
//        整数计算 整数相除结果还是整数,就是商
//        其他运算跟数学中是一模一样的
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

//        小数计算
//        小数参与直接计算，结果有可能不精确
        double c = 10.0;
        double d = 3.0;
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c % d);

    }
}
