package Operators;

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        boolean flag = a > b;
        System.out.println(flag);
        /**
         * 关系运算符的结果都是Boolean类型
         * 关系运算符组成的表达式，我们称为关系表达式 a > b
         */
    }
}
