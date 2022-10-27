package com.byonecup.OOP_IntermediateSection.extends_;

public class Sub extends Base {
    public Sub() {
//        super(); // 默认调用父类的无参构造器
        super("smith", 20);
        System.out.println("子类Sub()构造器被调用...");
    }

    public Sub(String name) {
        super("Li");
        System.out.println("子类Sub(String name)构造器被调用...");
    }

    public Sub(String name, int age) {
        super(); // 父类的无参构造器 或者 不写
        System.out.println("子类Sub(String name, int age)构造器被调用...");
    }

    public void sayOk() {
        // 父类的非private属性和方法都可以访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        System.out.println(getN4());
        callTest400();
    }
}
