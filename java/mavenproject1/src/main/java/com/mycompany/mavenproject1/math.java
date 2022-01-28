/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import static java.lang.Math.*;

/**
 *
 * @author qasem
 */
public class math {

    static int sum(int n1, int n2) {
        return n1 + n2;
    }

    static float sum(float n1, float n2) {
        return n1 + n2;
    }

    public static void main(String args[]) {
//
//        System.out.println("abs " + abs(-1.1));
//
//        int r = (int) (random() * ((10 - 1) + 1)) + 1;
//        System.out.println("random " + r);

        System.out.println("sum" + sum(2, 5));
        System.out.println("sum" + sum(2.2f, 5.3f));
    }

}
