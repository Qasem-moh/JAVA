/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author qasem
 */
public class Account {

    private int accountNo;
    private String name;
    private float amount;

    public void insert(int a, String n, float amt) {
        this.accountNo = a;
        this.name = n;
        this.amount = amt;
    }

    public void deposit(float amt) {
        this.amount = this.amount + amt;
        System.out.println(amt + "deposit");
    }

    public void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("DONT HAVE MANY");
        } else {
            this.amount = this.amount - amt;
            System.out.println(amt + "withdraw");
        }
    }

    public String checkPalance() {

        return (this.amount + "balance");
    }

    @Override
    public String toString() {
        return "Account{" + "accountNo=" + accountNo + ", name=" + name + ", amount=" + amount + '}';
    }

}
