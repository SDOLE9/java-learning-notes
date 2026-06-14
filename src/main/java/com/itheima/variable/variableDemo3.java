package com.itheima.variable;

public class variableDemo3 {
    static void main() {
        /*定义8种数据类型的变量:

        整数类型:byte、short、int、long
        浮点数类型:float、double
        字符类型:char
        布尔类型:boolean

        变量的定义格式:
        数据类型 变量名 =数据值定义8种数据类型的变量:*/

//        定义一个变量来表示byte的数据类型
        byte b = 127;
        System.out.println(b);
//        定义一个变量来表示short的数据类型
        short s = 32767;
        System.out.println(s);
//        定义一个变量来表示int的数据类型
        int i = 2147483647;
        System.out.println(i);
//        定义一个变量来表示long的数据类型
//        细节:long类型数据必须以L结尾,可以是大写的,也可以是小写
//        建议:一般写成大写的
        long l = 9223372036854775807L;
        System.out.println(l);
//        定义一个变量来表示float的数据类型
//        细节:float类型数据必须以f结尾,可以是大写的,也可以是小写
//        建议:一般写成大写的
        float f = 3.14F;
        System.out.println(f);
//        定义一个变量来表示double的数据类型
        double d = 3.14;
        System.out.println(d);
//        定义一个变量来表示char的数据类型
        char c = 'a';
        System.out.println(c);
//        定义一个变量来表示boolean的数据类型
        boolean bool = true;
        System.out.println(bool);

    }
}
