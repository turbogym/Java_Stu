package com.byonecup.OOP_IntermediateSection.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("Tom");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("小排骨");

        tom.feed(dog, bone);

        Cat cat = new Cat("咪咪");
        Fish fish = new Fish("黄花鱼");
        tom.feed(cat, fish);
    }
}
