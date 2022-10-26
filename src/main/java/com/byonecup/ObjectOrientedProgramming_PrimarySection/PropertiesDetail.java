package com.byonecup.ObjectOrientedProgramming_PrimarySection;

public class PropertiesDetail {
    public static void main(String[] args) {
        /**
         * 1) 属性的定义语法同变量，示例：访问修饰符 属性类型 属性名;
         *      访问修饰符有四种：public, protected, 默认, private
         * 2) 属性的定义类型可以为任意类型，包含基本类型或引用类型
         * 3) 属性如果不赋值，有默认值，规则和数组一致:
         *      int -> 0, short -> 0, byte -> 0, long -> 0, float -> 0.0,
         *      double -> 0.0, char -> \u0000, boolean -> false, String -> null
         */

        /**
         * 对象分配机制
         * Person p1 = new Person();
         * p1.age = 10;
         * p1.name = "小明";
         * Person p2 = p1; // 把p1赋给了p2，让p2指向p1。这里的p2在 栈 中存的地址和p1是同一个。
         * System.out.println(p2.age);
         */

        /**
         * 类与对象的内存分配机制
         * Java内存的结构分析：
         * 1) 栈：一般存放基本数据类型（局部变量）
         * 2) 堆：存放对象（Cat cat, 数组 等）
         * 3) 方法区：常量池（常量，比如字符串），类加载信息
         *
         * Java创建对象的流程简单分析
         * 1. 先加载Person类信息（属性和方法信息，只会加载一次）
         * 2. 在堆中分配空间，进行默认初始化（看规则）
         * 3. 把 堆 中的地址赋给p，p就指向对象
         * 4. 进行指定初始化，比如 p.name = "Jack"; p.age = 10;
         */

        /**
         * 练习：如下代码的输出
         */
        Person a = new Person();
        a.age = 10;
        a.name = "小明";
        Person b;
        b = a;
        System.out.println(b.name); // 小明
        b.age = 200;
        b = null;
        System.out.println(a.age); // 200
        System.out.println(b.age); // 异常
    }
}

class Person {
    String name;
    int age;
}
