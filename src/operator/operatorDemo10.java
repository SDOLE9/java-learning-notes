package operator;

import java.util.Scanner;

public class operatorDemo10 {
    static void main() {
        /*
        练习1:键盘录入一个整数,判断这个数字是否在1~10之间
        */
//        练习一
//        引入Scanner类
        Scanner sc = new Scanner(System.in);
//        输入一个整数
        System.out.println("请输入一个整数:");
        int a = sc.nextInt();
//        判断是否在1~10之间  &与 两者都要满足 |或 两者有一个满足 !非 取反操作
//        a>=1  a<=10 &来拼成判断条件
        boolean result = a >= 1 & a <= 10;
        System.out.println(result);
    }
}
