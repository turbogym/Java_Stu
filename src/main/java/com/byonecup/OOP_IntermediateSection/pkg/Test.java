package com.byonecup.OOP_IntermediateSection.pkg;

import com.byonecup.OOP_IntermediateSection.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        // 在不同的包下可以访问 public 修饰的属性或方法，不能访问protected, 默认, private修饰的属性或方法
        System.out.println("n1 = " + a.n1);
    }
}
