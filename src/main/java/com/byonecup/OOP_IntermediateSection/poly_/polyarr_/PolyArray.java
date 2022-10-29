package com.byonecup.OOP_IntermediateSection.poly_.polyarr_;

public class PolyArray {
    /**
     * 数组的定义类型为父类类型，里面保存的实际元素类型为子类类型
     * 应用实例:
     * 现有一个继承结构如下：要求创建 1 个 Person 对象、2 个 Student 对象和 2 个 Teacher 对象,
     * 统一放在数组 中，并调用每个对象 say 方法.
     */

    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Jack", 20);
        persons[1] = new Student("Tim", 18, 98.5);
        persons[2] = new Student("Lily", 19, 95.5);
        persons[3] = new Teacher("Li", 45, 5000);
        persons[4] = new Teacher("Wang", 38, 3800);

        // 循环遍历多态数组，调用toString
        for (int i = 0; i < persons.length; i++) {
            // persons[i] 编译类型是Person，运行类型是根据实际情况由JVM来判断
            System.out.println(persons[i].toString()); // 动态绑定机制

            if (persons[i] instanceof Student) { // 判断persons[i]的运行类型是不是Student
                Student student = (Student) persons[i];
                student.study();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            } else if (persons[i] instanceof Person) {

            } else {
                System.out.println("你的类型有误，请自行检查！");
            }

        }
    }

}
