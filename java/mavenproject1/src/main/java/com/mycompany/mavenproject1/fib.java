/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author qasem
 */
public class fib {

//    static int fib(int n){
//        if(n==0||n==1){
//            return n;
//        }else{
//            return (fib(n-1)+fib(n-2));
//        }
//    }
    static int n1 = 0, n2 = 1, n3;

    static void printFib(int n) {
        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3);
            printFib(n - 1);
        }
    }

    static int sumRangenumber(int n1, int n2) {
        if (n1 == n2) {
            return n1;
        } else {
            return n1 + sumRangenumber(n1 + 1, n2);

        }
    }

    public static void main(String args[]) {
//        System.out.println("fib = "+fib(7));
//        System.out.print(n1 + " " + n2);
//        int num = 5;
//        printFib(num - 2);
        System.out.println(sumRangenumber(4, 6));
    }
}
