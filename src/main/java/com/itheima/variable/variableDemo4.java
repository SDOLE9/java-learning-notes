package com.itheima.variable;

public class variableDemo4 {
    static void main() {
        /*BMI身体质量指数计算公式:BMI=体重+身高2(体重单位:千克,身高单位:米)
        1.定义变量记录我的体重(kg)
        2.定义变量记录我的身高(m)
        3.计算BMI
        4.输出结果
        */
        //定义变量记录我的体重
        double weight = 60;
        //定义变量记录我的身高
        double height = 1.77;
        //计算BMI
        double bmi = weight / (height * height);
        System.out.println(bmi);
/*拓展
计算当前身高在标准bmi最大的体重和最小体重
标准bmi范围为18.5~23.9
*/
        //计算最大体重
        double maxWeight = height * height * 23.9;
        System.out.println(maxWeight);
        //计算最小体重
        double minWeight = height * height * 18.5;
        System.out.println(minWeight);




    }
}
