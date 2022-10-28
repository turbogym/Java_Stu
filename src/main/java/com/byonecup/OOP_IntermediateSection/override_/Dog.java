package com.byonecup.OOP_IntermediateSection.override_;

public class Dog extends Animal{
    // 1. 因为Dog是Animal的子类
    // 2. Dog的cry()方法和Animal的cry()方法定义形式一样（名称、返回类型、参数）
    // 3. 这时就说Dog的cry()方法重写了Animal的cry()方法
    public void cry() {
        System.out.println("小狗汪汪叫...");
    }

    public String m1() {
        return null;
    }

    public String m2() {  // 如果这里返回值是Object，会报错，不兼容
        return null;
    }
}
