package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo6 {
    static void main() {

        /*
        需求:小明在每次订外卖都会在多家平台对比,看谁的优惠力度更大
        已知:饱了么App:全场9折优惠    美单App:满30减10元
        请问:小明买了一顿烧烤50元,在哪家下单更划算?
        如果价格不确定,数据由键盘录入而来呢?
        */
//        引入Scanner类
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入订单的价格:");
        double price = sc.nextDouble();

//        计算饱了么APP优惠后多少钱
        double price1 = price * 0.9;
        System.out.println("饱了么APP优惠后价格为" + price1);
        double price2 = 0;
        if (price >= 30) {
             price2 = price - 10;
             System.out.println("美单APP优惠后价格为" + price2);
        }else {
            price2 = price;
            System.out.println("美单APP没有优惠,保持原价" + price2);
        }

//        判断两个APP哪个最便宜
        if (price1 < price2) {
            System.out.println("饱了么APP更便宜");
        }else {
            System.out.println("美单APP更便宜");
        }
    }
}
