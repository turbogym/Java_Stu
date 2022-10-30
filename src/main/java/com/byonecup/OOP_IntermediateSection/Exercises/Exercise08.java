package com.byonecup.OOP_IntermediateSection.Exercises;

public class Exercise08 {
    /**
     * 设计一个Point类，其x和y坐标可以通过构造器提供。
     * 提供一个子类LabeledPoint,其构造器接受一个标签值和x,y坐标，
     * 比如：new LabeledPoint(“Black”,1929,230.07),
     * 写出对应的构造器即可
     */
    public static void main(String[] args) {
        new LabeledPoint("Black", 1929, 230.07);
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }
}
