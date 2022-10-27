package com.byonecup.OOP_IntermediateSection.super_;

public class B extends A{
    public int n1 = 888;

    public void test() {
        System.out.println("super.n1 = " + super.n1);
        super.cal();
    }

    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    public void sum() {
        System.out.println("B类的sum()方法...");
        // 调用父类的方法
        // 找cal()方法时，顺序是：先找本类，如果有且可以调用，则调用；如果没有则找父类，以此类推。
        // 如果查找方法的过程中，找到了，但是不能访问，则报错 cannot access
        // 如果查找方法的过程中，直到Object类都没有找到，则提示方法不存在。
        cal(); // 这里等价于this.cal();
        // super.cal(); // 表示不存在查找本类的过程，直接去查找父类

        // 访问属性的规则
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }

    public void ok() {
        super.test100();
        super.test200();
        super.test300();
    }

    public B() {
        super("tim");
    }
}
