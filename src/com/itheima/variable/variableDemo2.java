package com.itheima.variable;

public interface variableDemo2 {
    static void main() {
/*      我方:叉子
        攻击:220
        防御:85
        血量:1012.5
        技能加成:1.2

        对方:长手
        攻击:210
        防御:80
        血量:1223.3
        技能加成:1.3

        技能造成伤害的公式:攻击力 *技能加成 - 对方防御力
        普攻造成伤害的公式:攻击力- 对方防御力

        计算:
                我方第一次进行普通攻击,造成多少伤害,对方还剩余多少血量?
                我方第二次进行技能攻击,造成多少伤害,对方还剩余多少血量?

                规则:经常发生改变的数据,用变量记录
*/
//        定义一个变量来记录我方的攻击力
        int attack = 220;
//        定义一个变量来记录我方的防御力
        int defense = 85;
//        定义一个变量来记录我方的血量加成
        double blood = 1012.5;
//        定义一个变量来记录我方的技能加成
        double skill = 1.2;

//        定义一个变量来记录对方的攻击力
        int attack2 = 210;
//        定义一个变量来记录对方的防御力
        int defense2 = 80;
//        定义一个变量来记录对方的血量加成
        double blood2 = 1223.3;
//        定义一个变量来记录对方的技能加成
        double skill2 = 1.3;

//我方第一次进行普通攻击,造成多少伤害,对方还剩余多少血量? 普攻造成伤害的公式:攻击力- 对方防御力
        double damage = attack - defense2;
        blood2 = blood2 - damage;
        System.out.println("对方受到的伤害是:" + damage + " 对方还剩余:" + blood2);

//我方第二次进行技能攻击,造成多少伤害,对方还剩余多少血量? 技能造成伤害的公式:攻击力 *技能加成 - 对方防御力
        double damage2 = attack * skill - defense2;
        blood2 = blood2 - damage2;
        System.out.println("对方受到的伤害是:" + damage2 + " 对方还剩余:" + blood2);


    }
}
