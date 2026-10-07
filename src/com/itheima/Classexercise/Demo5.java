package com.itheima.Classexercise;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
//        计算电费 40p

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用电量（单位度）:");
        double usage = sc.nextDouble();
        if (usage >200) {
            double usage1 = usage - 200;
            double price =usage1*1.2+100*0.8+100*0.5;
            System.out.println("电费为："+price);
        }
            else if(usage >100 && usage <=200){
                double usage2 = usage - 100;
                double price =usage2*0.8+100*0.5;
                System.out.println("电费为："+price);
            }
            else if(usage >=0 && usage <=100){
                double price =usage*0.5;
                System.out.println("电费为："+price);
            }
            else{
                System.out.println("输入错误");
            }
    }
}
