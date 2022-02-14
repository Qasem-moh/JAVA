/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism;

/**
 *
 * @author qasem
 */
public class DailyEmployee extends Employee {

    private float workDayPrice;
    private int dailyRate;

    public float getWorkDayPrice() {
        return workDayPrice;
    }

    public void setWorkDayPrice(float workDayPrice) {
        this.workDayPrice = workDayPrice;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    /**
     *
     * @return
     */
    @Override
    public float getSalary() {
        return workDayPrice * dailyRate;
    }

    public DailyEmployee(float workDayPrice, int dailyRate, String name, String address, String department, String email, float salary) {
        super(name, address, department, email, salary);
        this.workDayPrice = workDayPrice;
        this.dailyRate = dailyRate;
    }

}
