package com.itheima.operator;

public class operatorDemo7 {
    static void main() {
        /*
        直接赋值  =
        加后赋值  +=
        减后赋值  -=
        乘后赋值  *=
        除后赋值 /==
        取模后赋值 %=
        */
        int a=10; int b = 20; int c = 30; int d = 40;
//  直接赋值
        a = b;
        System.out.println(a);
//  加后赋值
        a += b;
        System.out.println(a);
//  减后赋值
        a -= b;
        System.out.println(a);
//  乘后赋值
        a *= b;
        System.out.println(a);
//  除后赋值
        a /= b;
        System.out.println(a);
//  取模后赋值
        a %= b;
        System.out.println(a);
//  赋值运算符的优先级
        a = b + c;
        System.out.println(a);
        a = b + (c = d);
        System.out.println(a);
    }
}
