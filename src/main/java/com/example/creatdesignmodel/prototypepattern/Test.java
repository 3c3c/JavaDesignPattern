package com.example.creatdesignmodel.prototypepattern;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employees employees = new Employees();
        employees.loadData();

        Employees clone1 = (Employees)employees.clone();
        clone1.getEmpList().add("tianqi");

        Employees clone2 = (Employees)clone1.clone();
        clone2.getEmpList().remove("tianqi");

        System.out.println(employees);
        System.out.println(employees.hashCode());
        System.out.println("-----------------------------------");

        System.out.println(clone1);
        System.out.println(clone1.hashCode());
        System.out.println("----------------------------------");


        System.out.println(clone2);
        System.out.println(clone2.hashCode());
        System.out.println("----------------------------------");


    }
}
