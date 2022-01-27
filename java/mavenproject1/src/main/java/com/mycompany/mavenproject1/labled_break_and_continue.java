/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 * labeled break statement labeled continue statement
 *
 * @author qasem
 */
public class labled_break_and_continue {

    public static void main(String args[]) {
        stop:
        {
            for (int row = 1; row <= 10; row++) {
                for (int j = 1; j <= 10; j++) {
                    if (row == 5) {
                        break stop;
                    }
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
