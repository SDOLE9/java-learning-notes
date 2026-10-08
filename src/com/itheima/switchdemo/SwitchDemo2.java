package com.itheima.switchdemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        /*
        switch的注意点:
        1. 表达式:结果(字符/整数byte short int/枚举/字符串)被匹配的值,只能是真实的数据
        2. 被匹配的值,只能是真实的数据
        3. 值不允许重复
        4. break:结束当前的switch语句
        5. default:所有情况都不匹配,执行该处的内容
         */

        //测试注意项代码
        int number = 10;
        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("没有这个数字");
                break;
        }
    }
}
