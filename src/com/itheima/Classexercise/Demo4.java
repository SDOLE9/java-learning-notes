package com.itheima.Classexercise;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
//        BMI数值来判断身体状态以及健康风险  40p
//        引入Scanner类
        Scanner sc =new Scanner(System.in);
//        输入BMI数值 BMI计算公式=体重/身高^2
        System.out.println("请输入身高（单位米）:");
        double tall = sc.nextDouble();
        System.out.println("请输入体重（单位千克）:");
        double weight = sc.nextDouble();

//        输入合法性校验：身高体重必须大于0，否则不进入计算
        if (tall <= 0 || weight <= 0) {
            System.out.println("输入的身高体重必须大于0");
            return;
        }
        double bmi = weight/(tall*tall);
        if (bmi>=30){
            System.out.println("您的身体状态为严重肥胖，健康风险为严重增加");
        }else if (bmi>=27){
            System.out.println("您的身体状态为肥胖，健康风险为中度增加");
        }else  if (bmi>=24){
            System.out.println("您的身体状态为偏胖，健康风险为增加");
        }else  if (bmi>=18.5){
            System.out.println("您的身体状态为正常，健康风险为部分正常");
        }else {
            System.out.println("您的身体状态为消瘦，健康风险为部分增加");
        }
    }
}
