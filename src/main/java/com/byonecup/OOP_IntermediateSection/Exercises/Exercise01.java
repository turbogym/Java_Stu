package com.byonecup.OOP_IntermediateSection.Exercises;

public class Exercise01 {
    /**
     * 1. 定义一个Person类{name,age,job},初始化Person对象数组，有3个person对像，
     * 并按照age从大到小进行排序，提示，使用冒泡排序
     */
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Turbo", 22, "学生");
        people[1] = new Person("Jack", 18, "舞蹈老师");
        people[2] = new Person("Lily", 26, "会计");
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if (people[j].getAge() < people[j + 1].getAge()) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
