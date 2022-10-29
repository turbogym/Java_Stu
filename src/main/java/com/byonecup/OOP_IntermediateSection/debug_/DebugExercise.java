package com.byonecup.OOP_IntermediateSection.debug_;

public class DebugExercise {
    public static void main(String[] args) {
        // 创建对象的流程
        // 1) 加载Person类信息
        // 2) 初始化
        //      2.1) 默认初始化
        //      2.2) 显示初始化
        //      2.3) 构造器初始化
        // 3) 返回对象的地址
        Person turbo = new Person("Turbo", 22);
        System.out.println(turbo);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}