# Java 学习笔记

一个用于记录 Java 基础知识学习过程的代码仓库。

## 项目结构

```
java/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── itheima/
│                   ├── literal/          # 字面量相关练习
│                   │   └── literalDemo1.java
│                   └── variable/         # 变量与数据类型相关练习
│                       ├── variableDemo1.java
│                       ├── variableDemo2.java
│                       ├── variableDemo3.java
│                       └── variableDemo4.java
├── .gitignore
└── README.md
```

## 学习内容

### DAY1 - 变量与字面量

| 文件 | 内容说明 |
|------|----------|
| [literalDemo1.java](src/main/java/com/itheima/literal/literalDemo1.java) | 字面量的基本使用：字符串、整数、浮点数、字符的输出演示 |
| [variableDemo1.java](src/main/java/com/itheima/variable/variableDemo1.java) | 变量定义与使用：微信/支付宝/银行卡余额计算 |
| [variableDemo2.java](src/main/java/com/itheima/variable/variableDemo2.java) | 综合练习：游戏战斗系统的伤害计算 |
| [variableDemo3.java](src/main/java/com/itheima/variable/variableDemo3.java) | Java 8 种基本数据类型的变量演示 |
| [variableDemo4.java](src/main/java/com/itheima/variable/variableDemo4.java) | BMI 身体质量指数计算练习 |

## 环境要求

- JDK 8 或更高版本
- 任意 IDE（IntelliJ IDEA / Eclipse / VS Code）

## 编译与运行

### 方式一：使用命令行

```bash
# 进入源码目录
cd src/main/java

# 编译单个文件
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
