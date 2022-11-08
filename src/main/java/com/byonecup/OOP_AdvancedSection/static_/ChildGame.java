package com.byonecup.OOP_AdvancedSection.static_;

/**
 * @Author Turbo
 * @Description 类变量（静态变量）
 * @Date 2022/11/6 21:11
 * @Version 1.0
 */
public class ChildGame {
    /**
     * 类变量也叫静态变量/静态属性，是该类的所有对象共享的变量，任何一个该类的对象去访问它时，取到的都是相同的值，
     * 同样任何一个该类的对象去修改它时，修改的也是同一个变量。
     */
    public static void main(String[] args) {
        // 定义一个变量 count，统计有多少小孩加入了游戏
        int count = 0;
        Child child1 = new Child("Jim");
        child1.join();
//        count++;
        child1.count++;

        Child child2 = new Child("Lucy");
        child2.join();
//        count++;
        child2.count++;

        Child child3 = new Child("Wong");
        child3.join();
//        count++;
        child3.count++;

        // 类变量可以通过类名来访问
        System.out.println("共有" + Child.count + "个小孩加入了游戏...");
        System.out.println("child1.count=" + child1.count);
        System.out.println("child2.count=" + child2.count);
        System.out.println("child3.count=" + child3.count);
    }
}

class Child {
    private String name;
    // 定义一个变量count，是一个类变量（静态变量）
    // 该变量最大的特点就是会被Child类的所有的对象实例共享
    public static int count = 0;

    /**
     * 这个静态变量在JDK8以前，是在方法区的静态域里面，
     * 在JDK8之后，是在堆中的类对象的最后（Class实例的尾部）。
     * 在类加载的时候就生成了。
     * 不管static变量在哪里，共识：(1) static变量是同一个类所有对象共享的 (2) static类变量，在类加载的时候就生成了。
     */

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏...");
    }
}
