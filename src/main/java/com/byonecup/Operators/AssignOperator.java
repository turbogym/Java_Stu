package com.byonecup.Operators;

public class AssignOperator {
    public static void main(String[] args) {
        int n1 = 10;
        n1 += 4;
        System.out.println(n1);
        n1 /= 3;
        System.out.println(n1);
        /**
         * 赋值运算符特点
         * 1）运算顺序从右往左 int num = a + b + c;
         * 2）赋值运算符的左边 只能是变量，右边 可以是变量、表达式、常量值
         * int num = 20; int num2 = 78 * 34 - 10; int num3 = a;
         * 3）复合赋值运算符等价于下面的效果
         *    比如：a += 3;等价于a = a + 3;
         * 4）!!!复合赋值运算符会进行类型转换
         *    byte b = 2; b += 3（等价于 b = (byte)(b + 3) ）; b++;
         */
    }
}
