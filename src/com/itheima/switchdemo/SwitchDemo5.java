package com.itheima.switchdemo;

public class SwitchDemo5 {
    public static void main(String[] args) {
        /*
        3. switch新特性: JDK12预览版 JDK14正式版
        一、箭头标签
        二、case后面可以写多个值
        三、switch可以有运行结果
        四、yield关键字
         */

        //ctrl + alt + l 格式化代码

        //箭头标签
        int number = 4;
        switch (number) {
            /*case 1:
                System.out.println("1");
                break;
             */
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            //也可以写多个值，用逗号隔开
            case 3, 4, 5, 6 -> System.out.println("3");
            default -> System.out.println("没有匹配的数");
        }

        //yield关键字


        String name = switch (number) {
            case 1 -> "1";
            case 2 -> "2";
            case 3, 4, 5, 6 -> "3";
            default -> "没有匹配的数";
        };

        //如果后面要使用到switch的结果,那么就可以将switch的结果赋值给一个变量
        System.out.println(name);

            /*
            由下面代码简化为上面的代码
            case 1 ->{
                yield "1";
            }
            case 2 -> {
                yield "2";
            }
            default -> {
                yield "没有匹配的数";
            }
        };
            */

        // 练习题目：用switch表达式实现一个计算器的加减乘除功能
        int a = 10;
        int b = 5;
        String operator = "*";
/*
        int result = switch (operator) {
            case "*" -> {
                int sum = a * b;
                yield sum;
            }
            case "/" -> {
                int div = a / b;
                yield div;
            }
            case "+" -> {
                int add = a + b;
                yield add;
            }
            case "-" -> {
                int sub = a - b;
                yield sub;
            }
            default -> {
                yield 0;
            }
        };

*/
        int result = switch (operator) {
            case "*" -> a * b;
            case "/" -> a / b;
            case "+" -> a + b;
            case "-" -> a - b;
            default -> 0;
        };
        System.out.println(result);


    }
}
