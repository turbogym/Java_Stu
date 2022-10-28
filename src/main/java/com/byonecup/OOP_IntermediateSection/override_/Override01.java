package com.byonecup.OOP_IntermediateSection.override_;

public class Override01 {
    /**
     * 方法重写/覆盖
     * 方法重写就是子类有一个方法，和父类的某个方法的名称、返回类型、参数一样，
     * 那么我们就说子类的这个方法覆盖了父类的方法。
     *
     * 注意事项和使用细节
     * 1. 子类的方法的 形参列表，方法名称 要和父类方法的 形参列表，方法名称 完全一样。
     * 2. 子类方法的返回类型和父类方法返回类型一样，或者是 父类返回类型的子类
     *      比如：父类 返回类型是 Object，子类方法返回类型是String
     * 3. 子类方法不能缩小父类方法的访问权限。
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
    }
}
