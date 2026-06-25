package operator;

import java.util.Scanner;

public class operatorDemo3 {
    static void main() {
//        引入scanner打工人
        Scanner sc = new Scanner(System.in);
/*
描述

给定秒数 seconds,将其转换为对应的小时数、分钟数和秒数,使得总时间不变,但分钟数和秒数都不超过59
输入描述:
在一行中输入一个整数 seconds,表示要转换的秒数,满足(0≦seconds≤10^8)。
输出描述:
一行,包含三个整数,依次为输入整数对应的小时数、分钟数和秒数(可能为零),中间用一个空格隔开。
示例1
输入:3661
输出:1 1 1
将 3661 秒转换:3661÷3600=1 小时,余61秒;61÷60=1分钟,余1秒,结果为 111。
*/
//定义变量，输入一个整数3661
        int seconds = 3661;
//        计算小时数
        int hour = seconds / 3600;
        System.out.println("小时数是:" +hour);
//        计算分钟数
        int minute = seconds / 60 % 60;
        System.out.println("分钟数是:" +minute);
//        计算秒数
        int second = seconds % 60;
        System.out.println("秒数是:" +second);
//        结果拼接起来变成一个整体 如：1小时1分钟1秒
        System.out.println(hour + "小时" + minute + "分钟" + second + "秒");

//        缺少部分后面学习后会改进，目前这个是基础的逻辑运算


    }
}
