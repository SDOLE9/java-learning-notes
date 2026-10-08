package com.itheima.switchdemo;

public class SwitchDemo4 {
    public static void main(String[] args) {
        /*
        2. case穿透
        在我们写代码的时候,如果break没有写,此时就会触发case穿透现象
        执行流程:
        1. 拿着小括号中表达式的值跟下面的case进行匹配
        2. 如果匹配上了,就会执行case里面的语句体,遇到break结束整个的switch(正常情况)
        3. 如果在执行语句体的时候没有看到break,那么程序会继续执行下一个case的语句体,直到遇到break或者运行完整个的switch为止
        应用场景:
        当多个case的语句体重复的时候,利用case穿透节省代码
         */
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("没有这个数字");
                break;
        }

        /*
        int number2  = 2;
        switch (number2) {
            default:
                System.out.println("没有这个数字");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
        }
        结果为：2 3 先匹配后执行下面的语句体,直到遇到break或者运行完整个的switch为止
        */

         /*
        题目:根据月份输出对应的季节
        根据用户输入的月份,输出季节
        春季:3~5月
        夏季:6~8月
        秋季:9~11月
        冬季:12月、1月、2月
         */
        int month = 9;
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入错误，请输入1~12之间的月份");
        }
    }
}
