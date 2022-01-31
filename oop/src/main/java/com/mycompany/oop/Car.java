/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author qasem
 */
public class Car {

    private String name;
    private int maxSpeed;
    private float price;
    private int model;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setModel(int m) {
        if (m > 2015) {
            model = m;
        } else {
            System.out.println("done accept this model");
        }
    }

    public int getModel() {
        return model;
    }
}
