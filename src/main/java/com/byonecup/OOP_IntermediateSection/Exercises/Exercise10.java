package com.byonecup.OOP_IntermediateSection.Exercises;

public class Exercise10 {
    /**
     * 案例题目描述：
     * (1) 做一个Student类，Student类有名称(name),性别(sex),年龄(age)，学号(stu_id)，
     * 做合理封装，通过构造器在创建对象时将4个属性赋值。
     * (2) 写一个Teacher类，Teacher类有名称(name),性别(sex),年龄(age),工龄(work_age),
     * 做合理封装，通过构造器在创建对象时将4个属性赋值。
     * (3) 抽取一个父类Person类，将共同属性和方法放到Person类
     * (4) 学生需要有学习的方法(study)，在方法里写生“我承诺，我会好好学习。”。
     * (5) 教师需要有教学的方法(teach)，在方法里写上“我承诺，我会认真教学。”。
     * (6) 学生和教师都有玩的方法(play)，学生玩的是足球，老师玩的是象棋
     * 此方法是返回字符串的，分别返回“xx爱玩足球”和“xx爱玩象棋”（其中xx分别代表学生和老师的姓名)。
     * 因为玩的方法名称都一样，所以要求此方法定义在父类中，子类实现重写。
     * (7) 定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序
     * (8) 定义方法，形参为Person类型，功能：调用学生的study或教师的teach方法
     */
    public static void main(String[] args) {
        Person10[] people = new Person10[4];
        people[0] = new Student10("Tim", '男', 22, 30);
        people[1] = new Student10("Lily", '女', 21, 16);
        people[2] = new Teacher10("Wang", '男', 45, 10);
        people[3] = new Teacher10("Chen", '男', 30, 2);

        Exercise10 exercise10 = new Exercise10();
        exercise10.sort(people);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }

        for (int i = 0; i < people.length; i++) {
            exercise10.test(people[i]);
        }
    }

    // 定义方法，形参为Person类型，功能：调用学生的study或教师的teach方法
    // 这里使用向下转型
    public void test(Person10 p) {
        if (p instanceof Student10) {
            System.out.println(((Student10) p).study());
        } else if (p instanceof Teacher10) {
            System.out.println(((Teacher10) p).teach());
        } else {
            System.out.println("do nothing...");
        }
    }

    public void sort(Person10[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getAge() < people[j + 1].getAge()) {
                    Person10 person = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = person;
                }
            }
        }
    }

}

class Person10 {
    private String name;
    private char sex;
    private int age;

    public Person10(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return name + "爱玩";
    }

    @Override
    public String toString() {
        return "Person10{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}

class Student10 extends Person10 {
    private int stu_id;

    public Student10(String name, char sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String study() {
        return "我承诺，我会好好学习。";
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Student10{" +
                "stu_id=" + stu_id +
                '}' +
                study() +
                play();
    }
}

class Teacher10 extends Person10 {
    private int work_age;

    public Teacher10(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public String teach() {
        return "我承诺，我会认真教学。";
    }

    @Override
    public String play() {
        return super.play() + "象棋。";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Teacher10{" +
                "work_age=" + work_age +
                '}' +
                teach() +
                play();
    }
}