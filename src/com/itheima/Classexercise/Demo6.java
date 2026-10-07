package com.itheima.Classexercise;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        /*
        练习5:是否构成三角形

键盘录入任意三个大于0的小数,判断这三个数值构成什么类型的三角形

需要判断的类型如下:等边、等腰、直角、普通、无效

条件:两边之和>第三边
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数,分别为三角形的三边长:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
//        【建议】题目要求"三个大于0的数"：可以在判断三角形之前先校验
//        if (a <= 0 || b <= 0 || c <= 0) { System.out.println("边长必须大于0"); return; }
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("这是一个三角形");
        } else {
                System.out.println("不是三角形的三边长");
                return;
            }
        if(a==b && b==c){
            System.out.println("并且是一个等边三角形");
        }
            else if(a==b || a==c || b==c){
                System.out.println("并且是一个等腰三角形");
            }
//            【注意】a*a+b*b==c*c 用 == 精确比较小数，会因浮点误差判不出直角（如输入 0.3 0.4 0.5 会漏判）。
//            建议改成差值近似比较（Math.abs 是取绝对值）：
//            else if (Math.abs(a*a+b*b-c*c) < 0.000001 || Math.abs(a*a+c*c-b*b) < 0.000001 || Math.abs(b*b+c*c-a*a) < 0.000001)
            else if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a){
                System.out.println("并且是一个直角三角形");
            }
            else {
                System.out.println("并且是一个普通三角形");
            }
//        【提示】等腰直角三角形（如 1,1,约1.414）会先命中上面的"等腰"分支；
//        若题目要求直角优先提示，把直角判断移到等腰判断之前即可。

    }
}