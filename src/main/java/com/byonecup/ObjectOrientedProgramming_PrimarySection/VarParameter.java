package com.byonecup.ObjectOrientedProgramming_PrimarySection;

public class VarParameter {
    /**
     * 可变参数
     * Java允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法。
     * <p>
     * 基本语法：
     * 访问修饰符 返回类型 方法名(数据类型... 形参名) {
     * <p>
     * }
     * <p>
     * 注意事项和细节：
     * 1) 可变参数的实参可以为0个或任意多个
     * 2) 可变参数的实参可以为数组
     * 3) 可变参数的本质就是数组
     * !4) 可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
     * !5) 一个形参列表中只能出现一个可变参数
     */

    public static void main(String[] args) {
        Method Method = new Method();
        System.out.println(Method.sum());
        System.out.println(Method.sum(1, 2));
    }
}

class Method {
    // 可以计算2个数的和，3个数的和，4，5，...
    public int sum(int... nums) {
        // int... 表示接收的是可变参数，类型是int，即可以接收多个int（0~多）
        // 使用可变参数时，可以当做数组来使用，即nums可以当作数组
        // 遍历求和
        System.out.println("接收的参数个数 = " + nums.length);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}