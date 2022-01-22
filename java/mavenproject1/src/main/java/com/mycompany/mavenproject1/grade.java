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
public class grade {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float sum = 0;
        float grade = 0;
        int count = 0;
        while (grade != -1) {
            System.out.println("Enter grade #" + (count + 1) + ":");
            grade = in.nextFloat();
            if (grade != -1) {
                sum += grade;
                count++;
            }
        }
        System.out.println("AVG="+sum/count);

    }
}
