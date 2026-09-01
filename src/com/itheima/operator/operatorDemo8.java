package com.itheima.operator;

import java.util.Scanner;

public class operatorDemo8 {
    static void main() {
        /*
            练习1:键盘录入你和你好基友的身高比一比谁更高?

        */
//        引入Scanner类
        Scanner sc = new Scanner(System.in);

        //        练习一
        System.out.println("请输入你身高:");
        double a = sc.nextDouble();
        System.out.println("请输入你基友的身高:");
        double b = sc.nextDouble();
//        用布尔变量接收判断结果 单个布尔变量无法表示三种状态 所以需要用if语句来处理
      boolean result = a > b;
        System.out.println(result);
//        if语句判断
        if(a > b){
            System.out.println("你更高");
        }else if(a < b){
            System.out.println("你基友更高");
        }else if(a == b) {
            System.out.println("你们身高相等");
        }

    }
}
