package com.itheima.switchdemo;

public class SwitchDemo3 {
    public static void main(String[] args) {
        /*
        1. default的位置和省略
         位置:case和default是没有标准的上下之分,位置可以任意的书写
             为了观看比较方便,提高代码的阅读性
             一般来讲,case从小到大依次书写的,default是写在最下面的
         省略:default是可以省略不写的,在此时如果所有的case都不匹配,则没有任何的输出结果
         */
        int number = 10;
        switch (number) {
            case 2:
                System.out.println("2");
                break;
            case 1:
                System.out.println("1");
                break;
            case 3:
                System.out.println("3");
                break;
          /*  default:
                System.out.println("其他");
                break;
           */
        }

    }
}
