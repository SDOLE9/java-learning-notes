package com.itheima.operator;

public class operatorDemo13 {
    static void main() {

        // 寻找7的有缘数,定义一个两位整数,只要该数字包含7或者是7的倍数,就是7的有缘数

        // 定义一个两位整数
        int number = 78;

        //判断是否包含7或者是7的倍数
        int shi = number / 10;
        int ge = number % 10;
        boolean result = shi == 7 || ge == 7 || number % 7 == 0;
        System.out.println("7的有缘数判断result:" + result);

    }
}
