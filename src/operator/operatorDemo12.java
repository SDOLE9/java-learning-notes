package operator;

import java.util.Scanner;

public class operatorDemo12 {
    static void main() {
        //需求1:键盘录入一个四位整数,判断这个数字是否为回文数。

//        引入Scanner类
        Scanner sc = new Scanner(System.in);
//        输入一个四位整数
        System.out.println("请输入一个四位整数:");
        int number = sc.nextInt();
//        拆分四位整数的每一位数字 回文数是倒序读和正序读都相同的数
        int qian = number / 1000;
        int bai = number / 100 % 10;
        int shi = number / 10 % 10;
        int ge = number % 10;
//        判断是否为回文数   判断其中两对数是否相等 &&意思是 并且 两者都要满足，但是其中一个不满足的时候结果直接输出为false
        boolean result = qian == ge && bai == shi;
        System.out.println(result);

    }
}
