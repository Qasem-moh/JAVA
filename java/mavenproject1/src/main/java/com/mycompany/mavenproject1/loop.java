/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author qasem
 */
public class loop {

    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("outside loop" + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("inner loop" + j);
            }
        }
    }
}
