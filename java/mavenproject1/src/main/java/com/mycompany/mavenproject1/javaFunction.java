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
public class javaFunction {

    static int smallNumber(int n1, int n2, int n3) {
        int minNumber = n1;
        if (minNumber > n2) {
            minNumber = n2;
        }
        if (minNumber > n3) {
            minNumber = n3;
        }
        return minNumber;
    }

    static void fun() {
        System.out.println("Qasem");
        System.out.println("Qasem");
        System.out.println("Qasem");
        System.out.println("Qasem");
        System.out.println("Qasem");

    }

    static int sumNumber(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static void main(String args[]) {
//        fun();

//        System.out.println(sumNumber(5, 5));
        Scanner in = new Scanner(System.in);
        int x, y, z;
        System.out.println("Enter #1 :");
        x = in.nextInt();
        System.out.println("Enter #2 :");
        y = in.nextInt();
        System.out.println("Enter #3 :");
        z = in.nextInt();
        System.out.println("min = " + smallNumber(x, y, z));

    }
}
