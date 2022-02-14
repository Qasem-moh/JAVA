/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.anonymous;

/**
 *
 * @author qasem
 */
public class Main {

    public static void main(String args[]) {
//        Rewared emp1 = new Rewared();
//        overRewared em = new overRewared();
//        emp1.rewardMethod();
//        em.rewardMethod();
//////////////////////////////////////////////////////////

        TestClass test = new TestClass() {
            
            @Override
            public void testMethod() {
                System.out.println("Test2");
            }
        };

        test.testMethod();
    }
}
