/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author qasem
 */
public abstract class Car {

    float hight;
    float weight;
    int numberOfWheels;
    
    public Car(){}

    public Car(float hight, float weight, int numberOfWheels) {
        this.hight = hight;
        this.weight = weight;
        this.numberOfWheels = numberOfWheels;
    }
    
    
    
    public float getHight() {
        return hight;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    abstract void autoPilot();

    abstract void streamingServices();

    abstract void parkingSensiors();
}
