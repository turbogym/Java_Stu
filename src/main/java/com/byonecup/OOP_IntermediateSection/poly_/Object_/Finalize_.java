package com.byonecup.OOP_IntermediateSection.poly_.Object_;

public class Finalize_ {
    /**
     * finalize方法
     * 1) 当对象被回收时，系统自动调用该对象的 finalize 方法。子类可以重写该方法，做一些释放资源的操作
     * 2) 什么时候被回收：当某个对象没有任何引用时，则 jvm 就认为这个对象是一个垃圾对象，
     *    就会使用垃圾回收机制来 销毁该对象，在销毁该对象前，会先调用 finalize 方法。
     * 3) 垃圾回收机制的调用，是由系统来决定(即有自己的 GC 算法),
     *    也可以通过 System.gc() 主动触发垃圾回收机制，测试：Car [name]
     * 提示： 我们在实际开发中，几乎不会运用 finalize , 所以更多就是为了应付面试.
     */
    public static void main(String[] args) {
        Car car = new Car("宝马");
        car = null; // 这时 car对象就是一个垃圾，垃圾回收器就会回收（销毁），在销毁对象前，会调用的该对象的finalize方法
        // 程序员就可以在finalize方法中写自己的业务逻辑代码（比如释放资源：数据库连接，或者打开的文件等）
        // 如果程序员不重写finalize，那么就会调用Object类的finalize，即默认处理
        // 如果程序员重写了finalize，就可以实现自己的逻辑
        System.gc();
        System.out.println("程序退出了...");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    // 重写finalize
    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁了 汽车" + name);
        System.out.println("释放了某些资源...");
    }
}