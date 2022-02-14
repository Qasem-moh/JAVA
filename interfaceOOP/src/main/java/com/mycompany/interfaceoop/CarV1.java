/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceoop;

public class CarV1 implements Movable, SelfDrivable {

    private int x, y;
    private int numberofpassengers;

    public CarV1() {
    }

    public CarV1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void Distnation(String d) {
        System.out.println("Distnation =" + d);
    }

    @Override
    public void drive() {
        System.out.println("drive");
    }
}
