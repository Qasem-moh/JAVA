/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author qasem
 */
public class SUV extends Car{

      @Override
    void autoPilot() {
        System.out.println("SUV autoPilot");
    }

    @Override
    void streamingServices() {
         System.out.println("SUV streamingServices");
    }

    @Override
    void parkingSensiors() {
         System.out.println("SUV parkingSensiors");
    }
    
}
