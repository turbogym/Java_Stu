package com.byonecup.OOP_AdvancedSection.static_;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/6 21:11
 * @Version 1.0
 */
public class ChildGame {
    public static void main(String[] args) {
        // 定义一个变量 count，统计有多少小孩加入了游戏
        int count = 0;
        Child child1 = new Child("Jim");
        child1.join();
        count++;

        Child child2 = new Child("Lucy");
        child2.join();
        count++;

        Child child3 = new Child("Wong");
        child3.join();
        count++;

        System.out.println("共有" + count + "个小孩加入了游戏...");
    }
}

class Child {
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏...");
    }
}
