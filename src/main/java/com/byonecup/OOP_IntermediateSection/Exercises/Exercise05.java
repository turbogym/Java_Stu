package com.byonecup.OOP_IntermediateSection.Exercises;

public class Exercise05 {
}

class Grand {
    String name = "AA";
    private int age = 100;
    public void g1() {};
}

class Father extends Grand {
    String id = "001";
    private double score;
    public void f1() {
        String name = super.name;
        super.g1();
        String name1 = this.name;
        this.g1();
    };
}

class Son extends Father {
    String name = "BB";
    public void g1 () {}
    public void show() {
        String id = super.id;
        String name1 = super.name;
        super.g1();
    }
}