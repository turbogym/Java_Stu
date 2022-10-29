package com.byonecup.OOP_IntermediateSection.poly_;

public class PolyMethod {
    public static void main(String[] args) {
        // 方法重载体现多态
        A a = new A();
        // 这里传入不同的参数，就会调用不同sum方法，就体现多态
        System.out.println(a.sum(10, 20));
        System.out.println(a.sum(10, 20, 30));

        // 方法重写体现多态
        B b = new B();
        a.say();
        b.say();
    }
}

class B {
    public void say() {
        System.out.println("B 类 say() 方法被调用...");
    }
}

class A extends B {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public void say() {
        System.out.println("A say() 方法被调用...");
    }
}
