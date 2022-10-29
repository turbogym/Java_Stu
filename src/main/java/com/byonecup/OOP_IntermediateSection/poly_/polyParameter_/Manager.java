package com.byonecup.OOP_IntermediateSection.poly_.polyParameter_;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manege() {
        System.out.println("经理" + getName() + "正在管理...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
