package operator;

import java.util.Scanner;

public class operatorDemo8 {
    static void main() {
        /*
            练习1:键盘录入你和你好基友的身高比一比谁更高?

            练习2:键盘录入一个3位数,判断是否能被3整除

        */
//        引入Scanner类
        Scanner sc = new Scanner(System.in);

        //        练习一
        System.out.println("请输入你身高:");
        double a = sc.nextDouble();
        System.out.println("请输入你基友的身高:");
        double b = sc.nextDouble();
        if(a > b){
            System.out.println("你更高");
        }else {
            System.out.println("你基友更高");
        }

        //        练习二
            System.out.println("请输入一个3位数:");
            int c = sc.nextInt();
            if(c % 3 == 0){
                System.out.println("能被3整除");
            }else{
                System.out.println("不能被3整除");
            }
    }
}
