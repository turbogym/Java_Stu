package com.byonecup.OOP_IntermediateSection.poly_.polyParameter_;

import org.omg.Dynamic.Parameter;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("Tom", 2500);
        Manager milan = new Manager("Milan", 10000, 3000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(milan);
        polyParameter.testWork(tom);
        polyParameter.testWork(milan);
    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work(); // 向下转型
        } else if (e instanceof Manager) {
            ((Manager) e).manege(); // 向下转型
        } else {
            System.out.println("不做处理...");
        }
    }
}
