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
public class evenandodd {

    public static void main(String args[]) {

        System.out.println("Enter Number to check if odd or even");

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        if (num % 2 == 0) {
            System.out.println("your number" + num + "is even");
        } else {
            System.out.println("number is odd");
        }

    }

}
