/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author qasem
 */
public class avr {

    static float avg(float n1, float n2, float n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float x, y, z;
        System.out.println("enter #1");
        x = in.nextFloat();
        System.out.println("enter #2");
        y = in.nextFloat();
        System.out.println("enter #3");
        z = in.nextFloat();
        System.out.println("avg " + avg(x, y, z));
    }
}
