package com.byonecup.ObjectOrientedProgramming_PrimarySection;

public class ConstructorDetail {
    /**
     * 构造方法/构造器  注意事项和使用细节
     * 1) 一个类可以定义多个不同的构造器，即构造器重载。
     *      比如：我们可以再给Person类定义一个构造器，用来创建对象的时候，只指定人名，不需要指定年龄。
     * 2) 构造器名和类名要相同
     * 3) 构造器没有返回值
     * 4) 构造器是完成对象的初始化，并不是创建对象
     * 5) 在创建对象时，系统自动的调用该类的构造方法
     * 6) 如果程序员没有定义构造方法，系统会自动给类生成一个默认无参构造方法（也叫默认构造方法）
     *      比如 Person () {}，使用javap指令 反编译查看
     * 7) 一旦定义了自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无参构造器，除非显示的定义一下，即：Person (){}
     */

    /**
     * 对象创建的流程分析
     * 案例：
     * class Person {
     *     int age = 90;
     *     String name;
     *
     *     Person(String n, int a) {
     *         name = n;
     *         age = a;
     *     }
     * }
     * Person p = new Person("小倩", 20);
     * 分析：
     * 在内存中，首先在方法区加载Person类（Person.class）。
     * new的时候现在 堆 中开辟一个空间，堆 中这个空间首先对age和name进行默认的初始化，对应的0和null。
     * 然后进行显示的初始化，由于int age = 90，所以 堆 中的age的0就变为了90。
     * 接着看到new Person("小倩", 20);中还有构造器的处理，"小倩"是存在 常量池 的，所以 堆 中的age变为20，name指向 常量池 的一个地址。
     * 最后才把 堆 中的这一块空间地址返回给 栈 中的 p。
     * 注：真正的 对象 是 堆 中的那一块空间，p是对象的引用。
     */
}