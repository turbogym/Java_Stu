package com.byonecup.OOP_IntermediateSection.extends_.improve;

// 父类 Pupil和Graduate的父类
public class Student {
    // 共有属性
    public String name;
    public int age;
    private double score;

    // 共有方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生名" + name + " 年龄" + age + " 成绩" + score);
    }
}
