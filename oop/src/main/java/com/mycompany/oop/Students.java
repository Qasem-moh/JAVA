/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author qasem
 */
public class Students {

    private int no;
    private String name;
    private String password;
    private boolean loggedIn;
    private static int count = 1;
    private static String college = "IT";
    private static int minimalPasswordlength = 6;

    Students(String name, String password) {
        this.no = count;
        this.name = name;
        this.password = password;
        count++;
    }

    public boolean logIn(int enteredNo, String enterPassword) {
        if (enteredNo == no && enterPassword.equals(password)) {
            loggedIn = true;
            return true;
        } else {
            return false;
        }
    }

    public static boolean validation(String password) {
        if (password.length() >= minimalPasswordlength) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Students{" + "no=" + no + ", name=" + name + '}';
    }

}
