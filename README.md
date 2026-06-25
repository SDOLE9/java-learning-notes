# Java 学习笔记

一个用于记录 Java 基础知识学习过程的代码仓库。

## 项目结构

```
java/
├── src/
│   ├── com/itheima/
│   │   ├── literal/              # 字面量相关练习
│   │   │   └── literalDemo1.java
│   │   └── variable/             # 变量与数据类型相关练习
│   │       ├── variableDemo1.java
│   │       ├── variableDemo2.java
│   │       ├── variableDemo3.java
│   │       ├── variableDemo4.java
│   │       ├── variableDemo5.java
│   │       ├── variableDemo6.java
│   │       └── variableDemo7.java
│   └── operator/                 # 运算符相关练习
│       ├── operatorDemo1.java
│       ├── operatorDemo2.java
│       ├── operatorDemo3.java
│       ├── operatorDemo4.java
│       ├── operatorDemo5.java
│       ├── operatorDemo6.java
│       ├── operatorDemo7.java
│       └── operatorDemo8.java
├── .gitignore
└── README.md
```

## 学习内容

### 字面量（literal）

| 文件 | 内容说明 |
|------|----------|
| [literalDemo1.java](src/com/itheima/literal/literalDemo1.java) | 字面量的基本使用：字符串、整数、浮点数、字符的输出演示 |

### 变量（variable）

| 文件 | 内容说明 |
|------|----------|
| [variableDemo1.java](src/com/itheima/variable/variableDemo1.java) | 变量定义与使用：微信/支付宝/银行卡余额计算 |
| [variableDemo2.java](src/com/itheima/variable/variableDemo2.java) | 综合练习：游戏战斗系统的伤害计算 |
| [variableDemo3.java](src/com/itheima/variable/variableDemo3.java) | Java 8 种基本数据类型的变量演示 |
| [variableDemo4.java](src/com/itheima/variable/variableDemo4.java) | BMI 身体质量指数计算练习 |
| [variableDemo5.java](src/com/itheima/variable/variableDemo5.java) | Scanner 键盘输入：整数、小数、字符串的录入与输出 |
| [variableDemo6.java](src/com/itheima/variable/variableDemo6.java) | Scanner 练习：键盘录入两个数字并计算它们的和 |
| [variableDemo7.java](src/com/itheima/variable/variableDemo7.java) | Scanner 练习：键盘录入体重和身高，计算 BMI |

### 运算符（operator）

| 文件 | 内容说明 |
|------|----------|
| [operatorDemo1.java](src/operator/operatorDemo1.java) | 算数运算符：+、-、*、/、% 的整数与小数运算演示 |
| [operatorDemo2.java](src/operator/operatorDemo2.java) | 算数运算符练习：键盘录入三位数，拆分为个位/十位/百位 |
| [operatorDemo3.java](src/operator/operatorDemo3.java) | 算数运算符练习：秒数转换为小时、分钟、秒数（如 3661 → 1小时1分钟1秒） |
| [operatorDemo4.java](src/operator/operatorDemo4.java) | 类型转换：byte → int → double 的自动类型转换过程分析 |
| [operatorDemo5.java](src/operator/operatorDemo5.java) | 类型转换：short 相加结果为 int 的强制转换解决方案 |
| [operatorDemo6.java](src/operator/operatorDemo6.java) | 类型转换练习：大写字母转换为小写字母（A → a，通过 +32 实现） |
| [operatorDemo7.java](src/operator/operatorDemo7.java) | 赋值运算符：=、+=、-=、*=、/=、%= 的使用及优先级 |
| [operatorDemo8.java](src/operator/operatorDemo8.java) | 综合练习：键盘录入身高比较 + 判断三位数是否能被3整除 |

## 环境要求

- JDK 8 或更高版本
- 任意 IDE（IntelliJ IDEA / Eclipse / VS Code）

## 编译与运行

### 方式一：使用命令行

```bash
# 进入 src 目录
cd src

# 编译
javac com/itheima/variable/variableDemo1.java

# 运行（注意：需要将 main 方法签名改为标准形式：public static void main(String[] args)）
java com.itheima.variable.variableDemo1
```

### 方式二：使用 IDE

1. 用 IntelliJ IDEA 或 Eclipse 打开项目根目录
2. 找到对应 `.java` 文件，右键运行即可

## 说明

> 当前代码中的 `main` 方法签名为简化形式 `static void main()`，在正式编译运行前，
> 需要修改为标准签名：`public static void main(String[] args)`
