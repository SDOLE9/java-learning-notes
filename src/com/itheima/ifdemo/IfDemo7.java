package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo7 {
       public static void main(String[] args) {
        /*
需求:很多App都有不同的优惠券
假设,现在有以下优惠券
全场商品满10减8
全场商品满50减30
全场商品满100减50
全场商品满200减90

会员卡:全场8折
请问:会员卡和优惠券不能同时使用,最优惠的价格是多少?
        */
           //引入scanner
           Scanner sc = new Scanner(System.in);
//        定义一个变量,用于存储用户输入的商品价格
           System.out.println("请输入商品价格:");
           double originalPrice = sc.nextDouble();
           // 判断最优优惠券价格（从大到小判断）
           double couponPrice = 0;
           if (originalPrice >= 200) {
               couponPrice = originalPrice - 90;
           } else if (originalPrice >= 100) {
               couponPrice = originalPrice - 50;
           } else if (originalPrice >= 50) {
               couponPrice = originalPrice - 30;
           } else if (originalPrice >= 10) {
               couponPrice = originalPrice - 8;
           } else if (originalPrice >= 0) {
               couponPrice = originalPrice;
           }else {
               System.out.println("请输入正确的商品价格");
               return;
           }
             // 计算会员卡价格
           double memberPrice =originalPrice*0.8;
           // 判断最优惠的价格
           if (couponPrice >= memberPrice) {
               System.out.println("最优惠的价格是:"+memberPrice);
           } else {
               System.out.println("最优惠的价格是:"+couponPrice);
           }
       }
}
