package com.byonecup.OOP_IntermediateSection.extends_;

/**
 * 继承的本质
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        /**
         * 1. 首先在 方法区 中加载了 Object，GrandPa，Father，Son四个类 并建立了关联关系，Son指向Father，Father指向GrandPa，GrandPa指向Object
         * 2. 然后在 堆 中开始分配地址空间，首先是是GrandPa的name属性，指向 方法区 的 常量池，给name存入常量"大头爷爷"，hobby同理。
         * 3. 接着是Father的属性，会在 堆 中新开辟一个空间，首先是Father的name指向 常量池 的一个新地址存入"大头爸爸"，Father的age是int，所以直接在 堆 中存入39。
         * 4. 再是Son的name属性，在 堆 中新开辟一个空间，然后将name的值存入常量池。
         * 5. 最后是在 栈 中的son指向 堆 中的这一块整个空间的地址。
         */
        System.out.println(son.name); // 按照查找关系来返回信息
        /**
         * 首先看子类是否有该属性，如果子类有这个属性并且可以访问，则返回信息
         * 如果子类没有这个属性，就看父类有没有这个属性
         * 如果父类没有，就依次往上找，直到Object
         */
        System.out.println(son.getAge());
        // 假设以下的类Father和GrandPa都有age属性，如果使用son.age访问，在Father中设置为private时不能访问，会直接报错，而不会再去GrandPa类中查找
        System.out.println(son.hobby);
    }
}

class GrandPa {
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa { // 父类
    String name = "大头爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }
}

class Son extends Father { // 子类
    String name = "大头儿子";
}
