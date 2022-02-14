/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reallist;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author qasem
 */
public class Main {
    
    public static void main(String[] args) {
        new JFrame("Diffrent ways of creating JButton") {
            {
                getContentPane().setLayout(new FlowLayout());
                
                JButton b1 = new JButton("click1");
                class MyActionlistener implements ActionListener {
                    
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("1!");
                    }
                }
                b1.addActionListener(new MyActionlistener());
                add(b1);
                
                JButton b2 = new JButton("click2");
                b2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("2!");
                    }
                });
                add(b2);
                
                add(new JButton("click3") {
                    {
                        addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                System.out.println("3!");
                            }
                        });
                    }
                });
                
                add(new JButton("click4") {
                    {
                        addActionListener(e -> System.out.print("4!"));
                    }
                });
                
                pack();
                setVisible(true);
                
            }
        };
    }
}
