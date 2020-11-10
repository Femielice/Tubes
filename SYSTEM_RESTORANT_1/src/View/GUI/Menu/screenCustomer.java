/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUIMenu;

import View.GUI.Menu.screenMembership;
import View.GUI.Menu.screenOrderMakanan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        JButton managementStock;
        managementStock = new JButton("Management Stock");
        managementStock.setBounds(166, 200, 170, 30);
        frame.add(managementStock);
        
        JButton exit;
        exit = new JButton("Exit");
        exit.setBounds(355, 500, 70, 30);
        frame.add(exit);
        
        
        frame.setSize(500, 700);
        frame.setLayout(null);
        frame.setVisible(true);
    
    }
}
