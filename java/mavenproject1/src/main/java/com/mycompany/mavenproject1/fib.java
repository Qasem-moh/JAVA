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
    
    static int fib(int n){
        if(n==0||n==1){
            return n;
        }else{
            return (fib(n-1)+fib(n-2));
        }
    }
    
    
    public static void main(String args[]){
        System.out.println("fib = "+fib(7));
    }
}
