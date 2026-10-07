package com.itheima.operator;

public class OperatorDemo4 {
    static void main() {
//练习一:
byte b = 100;
short s = 200;
double d = 20.3;

// 请说出下面代码在计算的时候,类型转换的情况
double result1 = b + s + d;
// byte -> int -> double
System.out.println(result1);

    }
}
