package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo2 {
    static void main() {
        /*  需求:初始最大生命200,受到x点伤害,技能恢复Y点血,x和Y由键盘录入而来
            假设,游戏人物不会死亡,最少1点血
            问:最终游戏人物血量是多少?
        */
//       定义一个变量来表游戏人物的初始生命值200
        int hp = 200;
//        引入scanner 类
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入技能的伤害值：");
        int x = sc.nextInt();
        if (x >= hp) {        // 先拿伤害去跟「原始hp」比 → 真正判断是否致死
            hp = 1;           // 致死，设为最低血量
        } else {
            hp = hp - x;      // 没致死，正常扣血
        }
//Scanner定义技能回复血量
        System.out.println("请输入技能回复的血量：");
        int y = sc.nextInt();
        hp = hp+ y;
        if (hp > 200) {
            hp = 200;
        }
        System.out.println("最终游戏人物血量是:" + hp);
    }
}
