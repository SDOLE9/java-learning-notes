package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo8 {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品价格:");
        double price = sc.nextDouble();
//        判断优惠券折扣价格
        double couponPrice = 0;
        if(price >=0){
            if(price<10){
                couponPrice = price;
            }
            else if(price<50){
                couponPrice = 8;
            }
            else if(price<100){
                couponPrice = 30;
            }
            else if(price<200){
                couponPrice = 50;
            }
            else {
                couponPrice = 90;
            }
        }

//            判断会员卡折扣价格
        double memberPrice = price*0.2;
        if (couponPrice > memberPrice) {
            System.out.println("使用优惠券后，可以少付的价格是:"+couponPrice);
        }
        else {
            System.out.println("使用会员卡后，可以少付的价格是:"+memberPrice);
        }

    }

}
