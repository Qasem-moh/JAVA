/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism;

/**
 *
 * @author qasem
 */
public class HourlyEmployee extends Employee {

    private float workDayPrice;
    private int hourlyRate;

    public float getWorkDayPrice() {
        return workDayPrice;
    }

    public void setWorkDayPrice(float workDayPrice) {
        this.workDayPrice = workDayPrice;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    @Override
    public float getSalary() {
        return workDayPrice*hourlyRate;
    }

    public HourlyEmployee(float workDayPrice, int hourlyRate, String name, String address, String department, String email, float salary) {
        super(name, address, department, email, salary);
        this.workDayPrice = workDayPrice;
        this.hourlyRate = hourlyRate;
    }

}
