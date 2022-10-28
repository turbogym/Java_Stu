package com.byonecup.OOP_IntermediateSection.override_;

public class Student extends Person {
    private int id;
    private double score;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return "Student{" +
                super.say() +
                ", id=" + id +
                ", score=" + score +
                '}';
    }
}
