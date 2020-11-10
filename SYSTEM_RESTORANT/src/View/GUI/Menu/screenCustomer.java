/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUI.Menu;

import View.GUI.Menu.screenMembership;
import View.GUI.Menu.screenOrderMakanan;
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
public class screenCustomer {
    public screenCustomer(){
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Customers");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        
        JButton orderPesanan;
        orderPesanan = new JButton("Order Pesanan");
        orderPesanan.setBounds(179, 100, 130, 30);
        orderPesanan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new screenOrderMakanan();
            }
            
        });
        frame.add(orderPesanan);
        
        JButton inputMember;
        inputMember = new JButton("Membership");
        inputMember.setBounds(179, 150, 130, 30);
        inputMember.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new screenMembership();
            }
            
        });
        frame.add(inputMember);
        
        JButton managemenStock;
        managemenStock = new JButton("Management Stock");
        managemenStock.setBounds(166, 200, 170, 30);
        managemenStock.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new screenStock();
                } catch (IOException ex) {
                    Logger.getLogger(screenCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }   
        });
        frame.add(managemenStock);
        
        JButton exit;
        exit = new JButton("Exit");
        exit.setBounds(355, 500, 70, 30);
        frame.add(exit);
   
        frame.setLayout(null);
        frame.setVisible(true);
    
    }
}
