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
public class testUser {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Test yourSelf :) ");
        System.out.println("What is '5+10/2*10'");
        float userAnswer, theCorrectAnswer = 55;
        boolean questionAnser = false;

        for (int i = 0; i <= 3; i++) {
            userAnswer = in.nextFloat();
            if (userAnswer == theCorrectAnswer) {
                questionAnser = true;
                break;
            } else if (userAnswer != theCorrectAnswer) {
                if (i == 3) {
                    System.out.println("Chance #" + (i + 1));
                }
            }
        }

        if (questionAnser) {
            System.out.println("Correct Answer");
        } else {
            System.out.println("Wrong Answer");

        }
    }
}
