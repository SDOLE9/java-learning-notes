package com.itheima.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    static void main() {
//        引入scanner打工人，如果是AI自动生成的下面代码,需要点击Scanner,alt+回车(修改错误),选择第一个import即可
        Scanner sc = new Scanner(System.in);

//        键盘录入一个三位数
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();
//        将其拆分成个位、十位、百位
//        alt +p:强制让AI自动生成代码
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100;
        System.out.println("个位：" + ge);
        System.out.println("十位：" + shi);
        System.out.println("百位：" + bai);
    }
}
