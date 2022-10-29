package com.byonecup.OOP_IntermediateSection.poly_.Object_;

public class Equals01 {
    /**
     * ==和equals的对比
     * ==:
     * 1) ==：既可以判断基本类型，又可以判断引用类型
     * 2) ==：如果判断基本类型，判断的是值是否相等。示例：int i = 10; double d = 10;
     * 3) ==：如果判断引用类型，判断的是地址是否相等，即判定是不是同一个对象。
     * equals:
     * 4) equals：是Object类中的方法，只能判断引用类型
     * 5) 默认判断的是地址是否相等，子类中往往重写该方法，用于判断内容是否相等。比如Integer, String
     */
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);
        System.out.println(b == c);
        B obj = a;
        System.out.println(b == c);

        "hello".equals("hello");

        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));
    }
}

class A extends B{
}

class B {
}