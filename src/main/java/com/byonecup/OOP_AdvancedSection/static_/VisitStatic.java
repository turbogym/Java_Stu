package com.byonecup.OOP_AdvancedSection.static_;

/**
 * @Author Turbo
 * @Description TODO
 * @Date 2022/11/8 20:03
 * @Version 1.0
 */
public class VisitStatic {
    /**
     * 定义类变量
     * 访问修饰符 static 数据类型 变量名;
     * 或者
     * static 访问修饰符 数据类型 变量名;
     *
     * 访问类变量
     * 类名.类变量名
     * 或者
     * 对象名.类对象名
     * 静态变量的访问修饰符的访问权限和范围 和 普通属性是一样的。
     */
    public static void main(String[] args) {
        // 类变量是随着类的加载而创建，所以即使没有创建对象实例也可以访问
        System.out.println(A.name);

        A a = new A();
        System.out.println("a.name=" + a.name);
    }
}

class A {
    public static String name = "turbo!";
//    static public String name = "turbo!";
}