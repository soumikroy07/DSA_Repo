package com.soumik.oop.Lambda;

import LLD.ObserverPattern.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window {
    public static void main(String[] args) {

        // create a frame
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());



        // create a button & append it into the frame
        JButton button = new JButton("Click here");
        frame.add(button);


        // Use Lambda expression in Action event
        button.addActionListener((ActionEvent e) -> {
            System.out.println(" Button is clicked !!");
            JOptionPane.showConfirmDialog(null,"You clicked the button");
        });



        /*
        here we are using anonymous class for implementation because here we are using MouseListener
         which have multiple methods inside, it doesn't come under the FUNCTIONAL INTERFACE So we have to implement those
         methods using anonymous class
         */
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
