package com.byonecup.OOP_IntermediateSection.poly_.Object_;

public class ToString_ {
    /**
     * toString方法
     * 1) 基本介绍
     * 默认返回：全类名+@+哈希值的十六进制，【查看 Object 的 toString 方法】 子类往往重写 toString 方法，用于返回对象的属性信息
     * 2) 重写 toString 方法，打印对象或拼接对象时，都会自动调用该对象的 toString 形式.
     * 3) 当直接输出一个对象时， toString 方法会被默认的调用, 比如 System.out.println(monster); 就会默认调用monster.toString()
     */
    public static void main(String[] args) {
        /* Object 的 toString() 源码
         *  (1)getClass().getName() 类的全类名(包名+类名)
         *  (2)Integer.toHexString(hashCode()) 将对象的 hashCode 值转成 16 进制字符串
         *     public String toString() {
         *          return getClass().getName() + "@" + Integer.toHexString(hashCode());
         *     }
         */

        Monster monster = new Monster("小妖怪", "巡山的", 1000);
        System.out.println(monster.toString() + " hashcode=" + monster.hashCode());

        System.out.println("==当直接输出一个对象时，toString 方法会被默认的调用==");
        System.out.println(monster); //等价 monster.toString()
    }
}

class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    //重写 toString 方法, 输出对象的属性 //使用快捷键即可 alt+insert -> toString
    @Override
    public String toString() { //重写后，一般是把对象的属性值输出，当然程序员也可以自己定制
        return "Monster{" + "name='" + name + '\'' + ", job='" + job + '\'' + ", sal=" + sal + '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("fin..");
    }
}
