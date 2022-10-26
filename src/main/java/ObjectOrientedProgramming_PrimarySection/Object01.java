package ObjectOrientedProgramming_PrimarySection;

public class Object01 {
    public static void main(String[] args) {
        /**
         * 张老大养了两只猫猫：一只名字叫小白，今年3岁，白色。
         * 还有一只叫小花，今年100岁，花色。
         * 请编写一个程序，当用户输入小猫的名字时，就显示该猫的名字 年龄 颜色。
         * 如果用户输入的小猫名错误，则显示 张老大没有这只猫猫。
         */

        // 传统方式 => 不利于数据的管理（把一只猫的信息拆解了）
        String cat1Name = "小白";
        int cat1Age = 3;
        String cat1Color = "白色";

        String cat2Name = "小花";
        int cat2Age = 100;
        String cat2Color = "花色";

        // 数组 => 数据类型体现不出来；只能通过下标获取，造成变量名字和内容的对应关系不明确；不能体现猫的行为
        String[] cat1 = {"小白", "3", "白色"};
        String[] cat2 = {"小花", "100", "花色"};

        /**
         * 类与对象的关系
         * 例：猫类
         * 把所有的猫的特性（属性）提取出来 => 猫类（自定义数据类型） => 猫对象（具体的一只猫）
         */

        // 使用OOP面向对象解决
        // 实例化一只猫
        // 1. new Cat()创建一只猫
        // 2. Cat catOne = new Cat(); 把创建的猫赋给catOne
        // 3. catOne就是一个对象
        Cat catOne = new Cat();
        catOne.name = "小白";
        catOne.age = 3;
        catOne.color = "白色";

        // 创建了第二只猫，并赋给catTwo
        Cat catTwo = new Cat();
        catTwo.name = "小花";
        catTwo.age = 100;
        catTwo.color = "花色";

        // 访问对象属性
        System.out.println("第一只猫信息 " + catOne.name + " " + catOne.age + " " + catOne.color);
        System.out.println("第二只猫信息 " + catTwo.name + " " + catTwo.age + " " + catTwo.color);

        /**
         * 类与对象总结
         * 1) 类是抽象的，概念的，代表一类事物，比如人类、猫类...，即它是数据类型
         * 2) 对象是具体的，实际的，代表一个具体事物，即 是实例
         * 3) 类是对象的模板，对象是类的一个个体，对应一个实例
         */

        /**
         * 对象内存布局（对象、数组、String都是引用类型）
         * 内存中，在 栈 中，catOne指向一个在 堆 中的地址，
         * 在 堆 中，如果是catOne.name（String类型），栈 中的这个对应的地址应该指向 方法区 的 常量池中，
         * 在 常量池 中，才存放这个catOne.name的值"小白"；
         * 如果是catOne.age（int类型），栈 中的这个对应的地址直接存放这个值。
         *
         * ！！！
         * JDK1.6及以前，常量池在方法区，这时的方法区也叫做永久代；
         * JDK1.7的时候，方法区合并到了堆内存中，这时的常量池也可以说是在堆内存中；
         * JDK1.8及以后，方法区又从堆内存中剥离出来了，但实现方式与之前的永久代不同，这时的方法区被叫做元空间，常量池就存储在元空间。
         *
         * 在执行 Cat catOne = new Cat(); 的时候，内存中 方法区 会加载Cat类信息【属性信息、行为（方法）】
         */
    }
}

// 使用面相对象的方式来解决问题
// 定义一个猫类 Cat -> 自定义的数据类型
class Cat {
    // 属性/成员变量/field(字段)
    String name; // 名字
    int age; // 年龄
    String color; // 颜色
}