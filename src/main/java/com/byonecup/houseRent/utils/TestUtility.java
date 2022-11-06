package com.byonecup.houseRent.utils;

public class TestUtility {
    public static void main(String[] args) {
        // 这是一个测试类
        // 要求输入一个字符串，长度最大为3
        String s = Utility.readString(3);
        System.out.println("s=" + s);

        // 要求输入一个字符串，长度最大为10，如果用户直接回车，就给一个默认值（turbo!）
        String s2 = Utility.readString(10, "turbo!");
        System.out.println("s=" + s2);

        /**
         * 这里直接使用 类.方法()
         * 当一个方法是static时，就是一个静态方法
         * 注意：静态方法可以直接通过类名调用
         */
    }
}
