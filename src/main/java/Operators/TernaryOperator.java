package Operators;

/**
 * @author turbo
 */
public class TernaryOperator {
    public static void main(String[] args) {
        // 三元运算符 条件表达式 ? 表达式1 : 表达式2
        int a = 10;
        int b = 99;
        int result = a > b ? a++ : b--;
        System.out.println("result = " + result + " , a = " + a + " , b = " + b);
        // 表达式1和表达式2要为可以赋给接受变量的类型（或可以自动转换）

        // 练习：返回三个数的最大值
        int n1 = 3;
        int n2 = 5;
        int n3 = 4;
        int res = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
        System.out.println(res);

        // 运算符优先级：只有单目运算符、赋值运算符是从右向左运算的。
    }
}
