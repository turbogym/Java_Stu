package com.byonecup.OOP_IntermediateSection.extends_.improve;

import com.byonecup.OOP_IntermediateSection.extends_.improve.Graduate;
import com.byonecup.OOP_IntermediateSection.extends_.improve.Pupil;

public class TestExtends {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明~";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("==========");

        Graduate graduate = new Graduate();
        graduate.name = "老明~";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(80);
        graduate.showInfo();
    }
}
