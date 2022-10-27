package com.byonecup.OOP_IntermediateSection.modifier;

public class B {
    public void say() {
        A a = new A();
        // 在同一个包下，可以访问 public, protected 和 默认，不能访问private
        System.out.println("n1 = " + a.n1);
        System.out.println("n2 = " + a.n2);
        System.out.println("n3 = " + a.n3);
//        System.out.println("n4 = " + a.n4); // 不能访问private
    }
}
