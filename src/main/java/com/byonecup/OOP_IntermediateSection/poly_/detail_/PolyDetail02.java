package com.byonecup.OOP_IntermediateSection.poly_.detail_;

public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub(); // 向上转型
        System.out.println(base.count); // 看编译类型
    }
}

class Base {
    int count = 10;
}

class Sub extends Base {
    int count  = 20;
}
