package operator;

public class operatorDemo5 {
    static void main() {
//        检查下面代码,程序运行的时候是否会报错,如果会,请说明错误原因*/
        short s1 = 100;
        short s2 = 200;
//    byte result2 = s1 + s2;
//    System.out.println(result2);
//        解：会报错，因为s1和s2都是short类型，运算过程会先转化为int类型相加，所以输出结果是int类型。
//        解决方案：1.将s1和s2转为byte类型,但是可能会该改变输出结果。2.输出结果转为int类型
//        强制转换
       byte result2 = (byte) (s1 + s2);
        System.out.println(result2);
        int result3 =  s1 + s2 ;
        System.out.println(result3);
    }
}
