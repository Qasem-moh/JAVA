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
public class EvenAndOdd {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int num = 0;
        int sumEven = 0, sumOdd = 0;
        int i = 0;
        while (i < 10) {
            System.out.println("Enter Number");
            num = in.nextInt();
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            i++;
        }
        System.out.println("Even" + sumEven);
        System.out.println("odd" + sumOdd);
    }
}
