/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inhertaince;

/**
 *
 * @author qasem
 */
public class Employee {

    private String name;
    private String emailAddress;
    private String phone;
    private String department;
    private String address;
    private String yearOfbirth;

    public Employee() {
        System.out.println("no parmeter construcotr");
    }

    public Employee(String name, String emailAddress, String phone, String department, String address, String yearOfbirth) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.department = department;
        this.address = address;
        this.yearOfbirth = yearOfbirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYearOfbirth() {
        return yearOfbirth;
    }

    public void setYearOfbirth(String yearOfbirth) {
        this.yearOfbirth = yearOfbirth;
    }

}
