/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism;

/**
 *
 * @author qasem
 */
public class SalairedEmployee extends Employee {

    private float bouns;

    public float getBouns() {
        return bouns;
    }

    public void setBouns(float bouns) {
        this.bouns = bouns;
    }

    @Override
    public float getSalary() {
        return super.getSalary() + bouns;
    }

    public SalairedEmployee(float bouns,String name, String address, String department, String email, float salary) {
        super(name, address, department, email, salary);
        this.bouns = bouns;
    }
}
