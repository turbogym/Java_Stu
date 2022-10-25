package ObjectOrientedProgramming;

public class Constructor {
    /**
     * 构造方法/构造器
     * 构造方法又叫构造器(constructor)，是类的一种特殊的方法，它的主要作用是完成对新对象的初始化。
     *
     * 特点：
     * 1) 方法名和类名相同
     * 2) 没有返回值
     * 3) 在创建对象时，系统会自动的调用该类的构造器完成对对象的初始化。
     *
     * 看一个需求：前面我们在创建人类的对象时，是先把一个对象创建好后，再给他的年龄和姓名属性赋值，
     * 如果现在要求，在创建人类的对象时，就直接指定这个对象的年龄和姓名，这时就可以使用构造器。
     *
     * 基本语法
     * [修饰符]方法名(形参列表) {
     *      方法体;
     * }
     *
     * 说明：
     * 1) 构造器的修饰符可以默认
     * 2) 构造器没有返回值
     * 3) 方法名 和 类 名字必须一样
     * 4) 参数列表 和 成员方法 一样的规则
     * 5) 构造器的调用系统完成
     */

    public static void main(String[] args) {
        // new一个对象时，直接通过构造器指定名字和年龄
        PersonConstructor personConstructor = new PersonConstructor("Jack", 20);
    }
}

class PersonConstructor {
    String name;
    int age;

    // 构造器
    public PersonConstructor(String name, int age) {
        System.out.println("构造器被调用...完成对象的属性初始化");
        this.name = name;
        this.age = age;
    }
}
