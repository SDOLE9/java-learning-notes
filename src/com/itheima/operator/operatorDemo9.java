package com.itheima.operator;

import java.util.Scanner;

public class operatorDemo9 {
    static void main() {

//        练习2:键盘录入一个3位数,判断是否能被3整除
        //        练习二
        System.out.println("请输入一个3位数:");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a % 3 == 0){
            System.out.println("能被3整除");
        }else{
            System.out.println("不能被3整除");
        }
    }
}
