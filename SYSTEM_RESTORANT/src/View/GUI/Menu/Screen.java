/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUIMenu;


import Model.Order;
import View.GUI.Menu.screenCustomer;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author A442UF
 */
public class Screen {
    JButton InsertData;
    public Screen(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);

        
        frame.setLayout(null);
        frame.setVisible(true);
        JButton cashier;
        JButton customers;
        JButton manager;
        JLabel label;
        label = new JLabel("SELAMAT DATANG DI MENU RESTORANT");
        label.setBounds(125, 50, 300, 30);
        frame.add(label);
        
        
        customers = new JButton("Customers");
        customers.setBounds(179, 100, 100, 30);
        customers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new screenCustomer();
            }
        });
          frame.add(customers);
        
        cashier = new JButton("Cashier");
        cashier.setBounds(179, 140, 100, 30);
        frame.add(cashier);
        
        manager = new JButton("Manager");
        manager.setBounds(179, 180, 100, 30);
        frame.add(manager);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}


