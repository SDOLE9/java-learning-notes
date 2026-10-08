# Java 学习笔记

一个用于记录 Java 基础知识学习过程的代码仓库。

## 项目结构

```
java/
├── src/
│   └── com/itheima/
│       ├── literal/              # 字面量相关练习
│       │   └── literalDemo1.java
│       ├── variable/             # 变量与数据类型相关练习
│       │   ├── variableDemo1.java ~ variableDemo7.java
│       ├── operator/             # 运算符相关练习
│       │   ├── operatorDemo1.java ~ operatorDemo14.java
│       ├── ifdemo/               # 分支语句（if）相关练习
│       │   ├── IfDemo1.java ~ IfDemo8.java
│       ├── switchdemo/           # switch 分支语句练习
│       │   ├── SwitchDemo1.java ~ SwitchDemo5.java
│       └── Classexercise/        # 课堂综合练习题
│           ├── Demo1.java ~ Demo7.java
├── .gitignore
└── README.md
```

## 学习内容

### 1. 字面量 literal

| 文件                                                             | 内容说明     |
| -------------------------------------------------------------- | -------- |
| [literalDemo1.java](src/com/itheima/literal/literalDemo1.java) | 字面量的基本使用 |

### 2. 变量 variable

| 文件                 | 内容说明                   |
| ------------------ | ---------------------- |
| variableDemo1.java | 微信/支付宝/银行卡余额计算         |
| variableDemo2.java | 游戏战斗系统伤害计算             |
| variableDemo3.java | Java 8 种基本数据类型演示       |
| variableDemo4.java | BMI 身体质量指数计算           |
| variableDemo5.java | Scanner 键盘输入：整数、小数、字符串 |
| variableDemo6.java | Scanner：两数求和           |
| variableDemo7.java | Scanner：录入身高体重计算 BMI   |

### 3. 运算符 operator

| 文件                  | 内容说明                    |
| ------------------- | ----------------------- |
| operatorDemo1.java  | 算数运算符 + - \* / %        |
| operatorDemo2.java  | 拆三位数（个/十/百位）            |
| operatorDemo3.java  | 秒数转 时:分:秒               |
| operatorDemo4.java  | 自动类型转换分析                |
| operatorDemo5.java  | 强制类型转换                  |
| operatorDemo6.java  | 字母大小写转换（A→a）            |
| operatorDemo7.java  | 赋值运算符 = += -= \*= /= %= |
| operatorDemo8.java  | if 练习：比较两人身高，增加"身高相等"分支 |
| operatorDemo9.java  | if 练习：3 位数能否被 3 整除      |
| operatorDemo10.java | 逻辑运算符 &：判断是否在 1\~10     |
| operatorDemo11.java | 逻辑运算符 \|：判断是否不在 1\~10   |
| operatorDemo12.java | 逻辑运算符 &&：判断四位回文数        |
| operatorDemo13.java | 逻辑运算符 \|\|："7 的有缘数"     |
| operatorDemo14.java | 三元运算符：求两数较大值            |

### 4. 分支语句 ifdemo

| 文件           | 内容说明                           |
| ------------ | ------------------------------ |
| IfDemo1.java | if 入门：体温 ≥38℃ 警告               |
| IfDemo2.java | 游戏人物血量：伤害 + 回复 + 下限 1 / 上限 200 |
| IfDemo3.java | if 细节：K\&R 风格、大括号省略、小括号后不能加分号  |
| IfDemo4.java | if 判断布尔变量的正确写法                 |
| IfDemo5.java | 嵌套 if：成绩区间 1\~100 是否及格         |
| IfDemo6.java | 外卖平台对比：饱了么 9 折 vs 美单满 30 减 10  |
| IfDemo7.java | 优惠券 vs 会员卡哪个更划算（多档满减）          |
| IfDemo8.java | 优惠券金额 vs 会员卡折扣节省金额对比           |

### 5. 课堂练习 Classexercise

| 文件         | 内容说明                       |
| ---------- | -------------------------- |
| Demo1.java | 卡拉兹函数 Collatz：奇 3n+1 偶 n/2 |
| Demo2.java | 牛妹数：偶数且大于 50 输出 yes/no     |
| Demo3.java | 冲卡赠送：多档充值阶梯赠送金额计算          |
| Demo4.java | BMI 数值对应身体状态与健康风险分级输出      |
| Demo5.java | 电费阶梯计价：≤100度0.5元、100~200度0.8元、>200度1.2元 |
| Demo6.java | 三角形判断：先判是否构成三角形，再分类等边/等腰/直角/普通（含浮点比较注释） |
| Demo7.java | 坐标点位置判断：原点 / 坐标轴 / 四个象限（排除法） |

### 6. switch 分支 switchdemo

| 文件 | 内容说明 |
|------|----------|
| SwitchDemo1.java | switch 基础：录入星期数输出减肥计划（case/break/default） |
| SwitchDemo2.java | switch 注意点笔记：表达式类型、值不允许重复、break、default |
| SwitchDemo3.java | default 的位置与省略笔记 |
| SwitchDemo4.java | case 穿透（fall-through）讲解 + 季节判断练习 |
| SwitchDemo5.java | JDK14 新特性：箭头标签、多值 case、switch 表达式、yield + 计算器练习 |

## 环境要求

- JDK 8+（SwitchDemo5 的箭头标签/switch 表达式等新特性需要 JDK 14+）

- IntelliJ IDEA / Eclipse / VS Code 均可

## 说明

> 代码中的 `main` 方法为教学简化形式 `static void main()`，正式运行时改为
> `public static void main(String[] args)` 即可。

