/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author qasem
 */
public class loopForEach {

    public static int sum(int... n) {
        int s = 0;
        for (int i : n) {
            s += i;
        }
        return s;
    }

    public static void main(String args[]) {
        System.out.println("sum "+sum(1,2,2,3,14));
    }
}
