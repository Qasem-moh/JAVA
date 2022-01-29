/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author qasem
 */
public class twoDimensional {

    public static void main(String args[]) {
        int[][] arr = {
            {1, 5, 8},
            {5, 6},
            {4}
        };
//        System.out.println(arr[0].length);
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println(" ");
//        }

// another way to solve 
        for (int[] r : arr) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        

    }
}
