package com.itheima.operator;

public class operatorDemo14 {
    static void main() {
        // 利用三元运算符,求两个整数的较大值
        // 如果 a > b 是真的，就把 a 赋值给 max；否则，就把 b 赋值给 max。   a > b ? a : b
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println(max);
        /*
        等价于三元运算符的写法 if语句
                int max;
                if (a > b) {
                    max = a;
                } else {
                    max = b;
                }
        */
           }
}
