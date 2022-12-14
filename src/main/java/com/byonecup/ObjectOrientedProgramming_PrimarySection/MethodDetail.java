package com.byonecup.ObjectOrientedProgramming_PrimarySection;

public class MethodDetail {
    /**
     * 成员方法 注意事项和使用细节
     * 访问修饰符（作用是控制方法使用的范围，有四种）
     *
     * 返回类型
     * 1) 一个方法最多有一个返回值，如果有多个结果，可以使用数组类型
     * 2) 返回类型可以为任意类型，包含基本类型或引用类型（数组，对象）
     * 3) 如果方法要求有返回值类型，则方法体中最后的执行语句比如为return值；
     *    而且要求返回值类型必须和return的值类型一致或兼容
     * 4) 如果方法是void，则方法体中可以没有return语句，或者 只写return
     *
     * 形参列表
     * 1) 一个方法可以有0个参数，也可以有多个参数，中间用逗号隔开，比如getSum(int n1, int n2)
     * 2) 参数类型可以为任意类型，包含基本类型或引用类型，比如printArr(int[][] map)
     * 3) 调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型的参数！
     * 4) 方法定义时的参数成为形式参数，简称形参；方法调用时传入的参数成为实际参数，简称实参
     *    实参和形参的类型要一致或兼容，个数、顺序必须一致！
     *
     * 方法体
     * 里面写完成功能的具体的语句，可以为输入、输出、变量、运算、分支、循环、方法调用，
     * 但是里面不能再定义方法！
     * 即：方法不能被嵌套定义！
     */

    /**
     * 方法调用细节说明
     * 1) 同一个类中的方法调用：直接调用即可。
     * 2) 跨类中的方法A类调用B类方法：需要通过对象名调用。
     * 3) 特别说明：跨类的方法调用和方法的访问修饰符相关。
     */

    public static void main(String[] args) {
        A a = new A();
        a.m1();
        a.m2();
        a.m3();
    }
}

class A {
    public void m1() {
        System.out.println("A类的m1方法");
    }

    public void m2() {
        m1();
        System.out.println("A类m2方法继续执行...");
    }

    public void m3() {
        B b = new B();
        b.hi();
    }
}

class B {
    public void hi() {
        System.out.println("B类hi()...");
    }
}