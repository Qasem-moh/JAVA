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
public class GreateStudents {

    public static void main(String argsp[]) {
        System.out.println("Enter Grade: ");
        Scanner gradeUser = new Scanner(System.in);
        int grade = gradeUser.nextInt();

//        if (grade >= 90) {
//            System.out.println("A");
//        } else if (grade >= 80) {
//            System.out.println("B");
//        } else if (grade >= 70) {
//            System.out.println("C");
//        } else if (grade >= 60) {
//            System.out.println("D");
//        } else if (grade <= 50) {
//            System.out.println("fail");
        String r = (grade >= 90 && grade < 100) ? "A" : (grade >= 80 && grade < 90) ? "B" : (grade >= 70 && grade < 80) ? "C" : (grade >= 60 && grade < 70) ? "D" : "valid grade";
        System.out.println("grade is: " + r);
    }

}
