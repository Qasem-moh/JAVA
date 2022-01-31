/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author qasem
 */
public class Product {

    private String name;
    private String description;
    private float price;
    private int quentity;
    private float discount;
    private String color;

    public Product() {
        this.name = "No Name";
        this.description = "no discount";
        this.price = 0.0f;
        this.quentity = 0;
        this.discount = 0;
    }

    public Product(String n, String d, float p, int q, float dis) {
        this.name = n;
        this.description = d;
        this.price = p;
        this.quentity = q;
        this.discount = dis;
    }

    public Product(Product obj) {
        this.name = obj.name;
        this.description = obj.description;
        this.price = obj.price;
        this.quentity = obj.quentity;
        this.discount = obj.discount;
    }

    public Product(String n, String d, float p, int q, float dis, String color) {
        this(n, d, p, q, dis);
        this.color = color;
    }

    public Product(String n, String d, float p) {
        this.name = n;
        this.description = d;
        this.price = p;
    }

}
