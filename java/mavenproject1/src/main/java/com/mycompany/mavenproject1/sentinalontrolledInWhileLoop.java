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
public class sentinalontrolledInWhileLoop {

    public static void main(String args[]) {
        char letter = 'a';
        int counter = 0;

        Scanner in = new Scanner(System.in);
        while (letter != 'q') {
            letter = in.next().charAt(0);
            counter++;
        }
        System.out.println("Counter= " + counter);
    }
}
