/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceoop;

/**
 *
 * @author qasem
 */
public class Main {

    static void intefaceMethod(SelfDrivable s) {
        s.drive();
    }

    public static void main(String args[]) {

        SelfDrivable c1 = new CarV1();
        c1.drive();
        

    }
}
