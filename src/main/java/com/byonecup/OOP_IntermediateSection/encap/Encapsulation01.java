package com.byonecup.OOP_IntermediateSection.encap;

public class Encapsulation01 {
    /**
     * 面向对象编程有三大特征：封装、继承和多态。
     * <p>
     * 封装(encapsulation)就是把抽象出的数据[属性]和对数据的操作[方法]封装在一起，
     * 数据被保护在内部，程序的其它部分只有通过被授权的操作[方法]才能对数据进行操作。
     * <p>
     * 封装的理解和好处
     * 1) 隐藏实现细节 方法（连接数据库）<--调用（传入参数...）
     * 2) 可以对数据进行验证，保证安全合理
     * <p>
     * 封装的实现步骤
     * 1) 将属性进行私有化 private【不能直接修改属性】
     * 2) 提供一个公共的（public）set方法，用于对属性判断并赋值
     * public void serXxx(类型 参数名) { // Xxx表示某个属性
     * // 加入数据验证的业务逻辑
     * 属性 = 参数名;
     * }
     * 3) 提供一个公共的（public）get方法，用于获取属性的值
     * public 数据类型 getXxx() { // 权限判断
     * return xx;
     * }
     */

    public static void main(String[] args) {
        /**
         * 不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。
         * 年龄合理就设置，否则给默认年龄，必须在1-120，
         * 年龄，工资不能直接查看
         * name的长度在2-6字符之间
         */
        Person person = new Person();
        person.setName("Jack");
        person.setAge(22);
        person.setSalary(3000);
        System.out.println(person.info());

        // 如果我们直接使用构造器指定属性
        Person smith = new Person("smith", 3000, 50000);
        System.out.println(smith.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;

        // 我们可以将set方法写在构造器中
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 加入对数据的校验
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度请控制在2~6字符！");
            this.name = null;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄需要在1~120之间！");
            this.age = 18; // 给一个默认年龄
        }
    }

    public double getSalary() {
        // 可以在这里增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息： name = " + name + ", age = " + age + ", salary = " + salary;
    }
}