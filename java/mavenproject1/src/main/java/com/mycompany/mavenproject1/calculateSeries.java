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
public class calculateSeries {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int n=in.nextInt();
        float sum=0;
        for (int i = 1; i < n; i++) {
            sum+=1.0/i;
        }
        System.out.println("Sum= "+sum);
    }
}
