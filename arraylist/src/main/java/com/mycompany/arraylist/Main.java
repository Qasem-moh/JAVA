/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author qasem
 */
public class Main {

    static void displayMenu() {
        System.out.println();
        System.out.println(
                "1. Add element\n"
                + "2. Remove element\n"
                + "3. print elements\n"
                + "4. Exit");
        System.out.println();
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList();
        Scanner in = new Scanner(System.in);
        while (true) {
            displayMenu();
            int choices = in.nextInt();
            switch (choices) {
                case 1:
                    //add
                    System.out.println("eNTER AN INTEGER: ");
                    list.add(in.nextInt());
                    System.out.println("element added");
                    break;
                case 2:
                    System.out.println("Enter a number to be deleted: ");
                    int element = in.nextInt();
                    if (list.contains(element)) {
                        list.remove((Integer) element);
                        System.out.println("Element Removed");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;

                case 3:
                    System.out.println(list);
                    break;
                case 4:
                    return;
            }

        }
    }
}
