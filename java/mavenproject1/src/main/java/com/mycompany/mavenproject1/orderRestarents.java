/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author qasem
 */
public class orderRestarents {

    static float oreder(float total) {
        return total;
    }

    static float order(float total, int deliveryCost) {
        return total + deliveryCost;
    }

    static float order(float total, int deliveryCost, String promo) {
        return total + deliveryCost - 2;
    }

    public static void main(String args[]) {
        System.out.println(order(15, 3, "nvdsvs"));
    }
}
