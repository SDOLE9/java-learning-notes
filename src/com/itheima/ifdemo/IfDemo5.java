package com.itheima.ifdemo;

public class IfDemo5 {
    static void main() {
                /*
        需求:定义一个小数表示考试成绩
        判断学生的考试成绩,如果大于等于60分输出通过,否则不通过。
        */

//        定义一个变量表示考试成绩
        double score = 80;

//        对成绩是否合理进行判断 成绩区间于1~100
        if (score >= 1 && score <= 100) {
            if (score >= 60) {
                System.out.println("通过");
            } else {
                System.out.println("未通过");
            }
        }else {
            System.out.println("成绩不合法");
        }
    }
}
