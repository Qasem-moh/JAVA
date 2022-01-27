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
public class factorial {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");

        int num = in.nextInt();
        int f = 1;
        for (int i = num; i > 1; i--) {
            f = f * i;
        }
        System.out.println("num= " + f);

    }
}
