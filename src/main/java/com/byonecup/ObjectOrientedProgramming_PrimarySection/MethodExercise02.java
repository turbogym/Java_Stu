package com.byonecup.ObjectOrientedProgramming_PrimarySection;

public class MethodExercise02 {
    public static void main(String[] args) {
        PersonTest2 p = new PersonTest2();
        p.name = "Tom";
        p.age = 16;
        MyTools2 myTools2 = new MyTools2();
        PersonTest2 p2 = myTools2.copyPerson(p);
        System.out.println("p: " + p.name + " " + p.age);
        System.out.println("p2: " + p2.name + " " + p2.age);

        System.out.println(p == p2); // false

        p2.name = "Cat";
        System.out.println("p: " + p.name + " " + p.age);
        System.out.println("p2: " + p2.name + " " + p2.age);
        // 特殊：String 在java成安全的String，
        // 对于String的任一个操作都是先重新生成一个String的拷贝， 然后对这个拷贝进行操作。
        // 所以String在参数传递的时候可以看作是值传递
        // Str是不可变类型，在克隆后，p1.name与p2.name指向同一个地址，
        // 修改其中一个，只是会使其重新指向另一个地址，不影响另外一个
        // p和p2地址值不同，p.name和p2.name地址值相同，但是改p.name是新建了一个常量让p.name指向它，p2.name仍然指向“Milan”
    }
}

class PersonTest2 {
    String name;
    int age;
}

class MyTools2 {
    /**
     * 编写一个方法copyPerson,可以复制一个Person对象，返回复制的对象。
     * 克隆对象，注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
     */
    public PersonTest2 copyPerson(PersonTest2 p) {
        PersonTest2 p2 = new PersonTest2();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}
