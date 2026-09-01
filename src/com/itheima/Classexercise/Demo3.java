package com.itheima.Classexercise;

import java.util.Scanner;

public class Demo3 {
    static void main() {

//        冲卡赠送题目  黑马视频40p
//        引入Scanner类
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入冲卡金额:");
        double money = sc.nextDouble();
//        计算充值金额+赠送金额
        double totalMoney = 0;
        if (money>=50000){
            totalMoney = money + 15000;
        }else if (money>=20000){
            totalMoney = money + 6000;
        }else if (money>=10000){
            totalMoney = money + 2500;
        }else if (money>=5000){
            totalMoney = money + 1300;
        }else if (money>=3000){
            totalMoney = money + 700;
        }else if (money>=2000){
            totalMoney = money + 500;
        }else if (money>=1000){
            totalMoney = money + 200;
        }
        else {
            System.out.println("请输入正确的冲卡金额");
            return;
        }
        System.out.println("您的充值金额+赠送金额为:"+totalMoney);
    }
}
