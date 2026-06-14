package com.itheima.variable;

public class variableDemo1 {
    static void main() {
/*微信余额：0元
支付宝余额：10元
银行卡余额：20元*/
//        定义一个变量来记录微信的余额
        int weixin = 0;
//        定义一个变量来记录支付宝的余额
        int zhifubao = 10;
//        定义一个变量来记录银行卡的余额
        int bank = 20;
//        问题一：现在总共有多少钱？
        int sum = weixin + zhifubao + bank;
        System.out.println("现在总共有" + sum + "元");

//        问题二：微信现在收到了10元的红包，又发出了2元的红包，现在余额是多少？
        weixin = weixin + 10 - 2;
//        上面这一步是微信余额增加10元，再减少2元 也就是weixin+10-2，然后再赋值回变量weixin。
//        现在三者相加余额总共多少？
        sum = weixin + zhifubao + bank;
        System.out.println("现在总共有" + sum + "元");

    }
}
