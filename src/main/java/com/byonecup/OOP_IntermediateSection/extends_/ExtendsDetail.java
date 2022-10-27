package com.byonecup.OOP_IntermediateSection.extends_;

public class ExtendsDetail {
    /**
     * 1) 子类继承了所有的属性和方法，非私有的属性和方法可以在子类直接访问,
     *    但是私有属性和方法不能在子类直接访问，要通过父类提供公共的方法去访问
     * 2) 子类必须调用父类的构造器， 完成父类的初始化
     * 3) 当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，
     *    如果父类没有提供无参构造器，则必须在子类的构造器中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过
     * 4) 如果希望指定去调用父类的某个构造器，则显式的调用一下 : super(参数列表)
     * 5) super 在使用时，必须放在构造器第一行(super 只能在构造器中使用)
     * 6) super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
     * 7) java 所有类都是 Object 类的子类, Object 是所有类的基类.
     * 8) 父类构造器的调用不限于直接父类！将一直往上追溯直到 Object 类(顶级父类)
     * 9) 子类最多只能继承一个父类(指直接继承)，即 java 中是单继承机制。
     *    思考：如何让 A 类继承 B 类和 C 类？ 【A 继承 B， B 继承 C】
     * 10) 不能滥用继承，子类和父类之间必须满足 is-a 的逻辑关系
     */

    public static void main(String[] args) {
        System.out.println("---第1个对象---");
        Sub sub = new Sub();
        System.out.println("---第2个对象---");
        Sub sub2 = new Sub("Jack");
        System.out.println("---第3个对象---");
        Sub sub3 = new Sub("Lu", 20);
        sub.sayOk();
    }
}
