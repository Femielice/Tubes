/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUI.Menu;

import View.GUIMenu.Screen;
import View.GUIMenu.screenCustomer;
import View.GUI.OrderMakanan.screenMakanan;
import View.GUI.OrderMakanan.screenMinuman;
import View.GUI.OrderMakanan.screenTopping;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author A442UF
 */
public class screenOrderMakanan {
    public screenOrderMakanan(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Order Makanan");
        label.setBounds(180, 50, 300, 30);
        frame.add(label);
        
        JButton makanan;
        makanan = new JButton("Makanan");
        makanan.setBounds(100, 100, 100, 30);
        makanan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new screenMakanan();
                } catch (IOException ex) {
                    Logger.getLogger(screenOrderMakanan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        frame.add(makanan);
        
        JButton minuman;
        minuman = new JButton("Minuman");
        minuman.setBounds(100, 170, 100, 30);
        minuman.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new screenMinuman();
                } catch (IOException ex) {
                    Logger.getLogger(screenOrderMakanan.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        });
        frame.add(minuman);
        
        JButton topping;
        topping = new JButton("Topping");
        topping.setBounds(270, 100, 100, 30);
        topping.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new screenTopping();
                } catch (IOException ex) {
                    Logger.getLogger(screenOrderMakanan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        frame.add(topping);
        
        JButton back;
        back = new JButton("Back");
        back.setBounds(270, 170, 100, 30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new screenCustomer();
            }
        });
        frame.add(back);
        
        JButton exit;
        exit = new JButton("Exit");
        exit.setBounds(355, 500, 70, 30);
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new Screen();
            }
            
        });
        frame.add(exit);
        
        frame.setSize(500, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
