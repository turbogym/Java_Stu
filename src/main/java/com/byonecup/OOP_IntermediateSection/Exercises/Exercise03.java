package com.byonecup.OOP_IntermediateSection.Exercises;

public class Exercise03 {
    /**
     * 通过继承实现员工工资核算打印功能
     * <p>
     * 父类：员工类
     * 子类：部门经理类、普通员工类
     * <p>
     * (1) 部门经理工资=1000+单日工资*天数*等级(1.2)。
     * (2) 普通员工工资=单日工资*天数*等级(1.0)：
     * (3) 员工属性：姓名，单日工资，工作天数
     * (4) 员工方法（打印工资）
     * (5) 普遍员工及部门经理都是员工子类，需要重写打印工资方法。
     * (6) 定义并初始化普通员工对象，调用打印工资方法输入工资，定义并初始化部门经理对象，调用打印工资方法输入工资
     */
    public static void main(String[] args) {
        Employee e = new Manager("小王", 200, 30, 1.2);
        Manager m = (Manager) e;
        m.setBonus(10000);
        m.printSal();
    }
}

class Employee {
    private String name;
    private double daySal;
    private int workDays;
    private double grade;

    public Employee(String name, double daySal, int workDays, double grade) {
        this.name = name;
        this.daySal = daySal;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printSal() {
        System.out.println(name + " 工资=" + workDays * daySal * grade);
    }
}

class Manager extends Employee {
    private double bonus;

    // 创建Manager对象时，奖金是多少并不是确定的，因此在构造器中不给奖金，在set方法中设置
    public Manager(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("经理 " + getName() + " 工资=" + (bonus + getDaySal() * getWorkDays() * getGrade()));
    }
}