package com.itheima.Classexercise;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
/*
练习6:直角坐标系位置判断(课堂练习,自己独立完成)

规则:

输入变量x,y,判断点所在区域:

情况1:原点(x=0且y=0)

情况2:第 1象限、第 2象限、第 3象限、第 4象限

情况3:在y轴上(x=0且y!=0)

情况4:在x轴上(y=0且x!=0)
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x坐标:");
        double x = sc.nextDouble();
        System.out.println("请输入y坐标:");
        double y = sc.nextDouble();
//        【已掌握】最后一个 else 没有写条件，靠"命中即止"排除法：走到这说明原点/两轴/1、2、4象限都不成立，
//        剩下的必然是第3象限。这个写法是正确且聪明的。
//        【提示】else if(x==0 && y!=0) 里的 y!=0 逻辑上冗余（前面已排除原点，此处 x==0 则 y 必不为0）；
//        y==0 && x!=0 里的 x!=0 同理。写全也完全正确，可读性反而更好。
        //判断点所在区域
        if (x == 0 && y == 0) {
            System.out.println("原点");
        } else if (x == 0 && y != 0) {
            System.out.println("在y轴上");
        } else if (y == 0 && x != 0) {
            System.out.println("在x轴上");
        } else if (x > 0 && y > 0) {
            System.out.println("第1象限");
        } else if (x > 0 && y < 0) {
            System.out.println("第4象限");
        } else if (x < 0 && y > 0) {
            System.out.println("第2象限");
        } else {
            System.out.println("第3象限");
        }

    }
}