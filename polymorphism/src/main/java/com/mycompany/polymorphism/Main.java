/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism;

/**
 *
 * @author qasem
 */
public class Main {

    public static void main(String args[]) {
        Employee e1 = new Employee("Qasem", "Amman", "web", "qasem@gmail.com", 1000);
        SalairedEmployee e2=new SalairedEmployee(200,"Qasem", "Amman", "web", "qasem@gmail.com", 1000);
        System.out.println("salary " + e1.getSalary());
        System.out.println("salary " + e2.getSalary());
    }
}
