package com.byonecup.OOP_IntermediateSection.extends_;

public class ExtendsExercises {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("------");
        C1 c1 = new C1();
        System.out.println("------");
        /**
         * 编写 Computer 类，包含 CPU、内存、硬盘等属性，getDetails 方法用于返回 Computer 的详细信息
         * 编写 PC 子类，继承 Computer 类，添加特有属性【品牌 brand】
         * 编写 NotePad 子类，继承 Computer 类，添加特有属性【color】
         * 编写 Test 类，在 main 方法中创建 PC 和 NotePad 对象，分别给对象中特有的属性赋值，以及从 Computer 类继承的 属性赋值，并使用方法并打印输出信息
         */
        PC pc = new PC("intel", 16, 500, "IBM");
        pc.printInfo();
    }
}

class A {
    A() {
        System.out.println("a");
    }

    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    B() {
        this("abc");
        System.out.println("b");
    }
    B(String name){
        System.out.println("b name"); // 有默认的super();
    }
}

class A1 {
    public A1() {
        System.out.println("我是A类");
    }
}

class B1 extends A1 {
    public B1() {
        System.out.println("我是B类的无参构造");
    }

    public B1(String name) {
        System.out.println(name + "我是的B类的有参构造");
    }
}

class C1 extends B1 {
    public C1() {
        this("hello");
        System.out.println("我是C类的无参构造");
    }

    public C1(String name) {
        super("turbo");
        System.out.println("我是C类的有参构造");
    }
}

class Computer {
    private String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getDetails() {
        return "cpu=" + cpu + " memory=" + memory + " disk=" + disk;
    }
}

class PC extends Computer {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // 继承设计的基本思想，父类的构造器完成父类属性初始化，子类的构造器完成子类属性初始化
    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("PC的信息：");
        System.out.println(getCpu() + " " + getMemory() + " " + getDisk());
        System.out.println(getDetails() + " brand = " + brand);
    }
}