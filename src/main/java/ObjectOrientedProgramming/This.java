package ObjectOrientedProgramming;

public class This {
    /**
     * This关键字
     * Java虚拟机会给每个对象分配this，代表当前对象。
     *
     * 简单来说，哪个对象调用，this就代表哪个对象
     *
     * 注意事项和使用细节
     * 1) this关键字可以用来访问本类的属性、方法、构造器
     * 2) this用于区分当前类的属性和局部变量
     * 3) 访问成员方法的语法：this.方法名(参数列表);
     * 4) 访问构造器的语法：this(参数列表); ！！！注意只能在构造器中使用，且要放在第一句
     * 5) this不能在类定义的外部使用，只能在类定义的方法中使用
     */
    public static void main(String[] args) {
        Dog d1 = new Dog("大壮", 3);
        d1.info();
        System.out.println("dog1的hashCode = " + d1.hashCode());
        Dog d2 = new Dog("大黄", 5);
        d2.info();
        System.out.println("dog2的hashCode = " + d2.hashCode());
    }
}

class Dog {
    String name;
    int age;

    public Dog () {
        // 细节4
        this("小白", 2); // 访问构造器的语法：this(参数列表); ！！！注意只能在构造器中使用，且要放在第一句
    }

    public Dog(String name, int age) {
        // this.name 就是当前对象的属性name
        this.name = name;
        // this.age 就是当前对象的属性age
        this.age = age;
        System.out.println("构造器this.hashCode() = " + this.hashCode());
    }

    public void info() {
        System.out.println("name = " + name + " age = " + age);
    }
}