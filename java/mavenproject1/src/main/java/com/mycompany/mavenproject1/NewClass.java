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
public class NewClass {

    public static void main(String args[]) {
        System.out.println("Enter Number");
        Scanner f1=new Scanner(System.in);
        int f11=f1.nextInt();
        if (f11>5)
            System.out.println("Thank you, your number is :"+f11);
        else
            System.out.println("sorry");
    }
}
