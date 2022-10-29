package com.byonecup.OOP_IntermediateSection.poly_.objPoly_;

import com.byonecup.OOP_IntermediateSection.super_.A;

import java.util.ArrayList;

public class PolyObject {
    /**
     * 对象的多态
     * 1) 一个对象的编译类型和运行类型可以不一致
     * 2) 编译类型在定义对象时，就确定了，不能改变
     * 3) 运行类型是可以变化的
     * 4) 编译类型看定义时 = 号 的左边，运行类型看 = 号 的右边
     */
    public static void main(String[] args) {
        // 对象多态
        // animal编译类型是Animal，运行类型是Dog
        Animal animal = new Dog();
        animal.cry();

        animal = new Cat();
        animal.cry();
    }
}
