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
public class simpleCalc {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one of these opertores + - * / % ");
        char c = in.next().charAt(0);

        int n1, n2;
        System.out.println("Enter number 1: ");
        n1 = in.nextInt();
        System.out.println("Enter number 2: ");
        n2 = in.nextInt();

        switch (c) {
            case '+' ->
                System.out.println("res= " + (n1 + n2));

            case '-' ->
                System.out.println("res= " + (n1 - n2));
            case '/' ->
                System.out.println("res= " + (n1 / n2));

            case '*' ->
                System.out.println("res= " + (n1 * n2));
            case '%' ->
                System.out.println("res= " + (n1 % n2));
        }
    }
}
