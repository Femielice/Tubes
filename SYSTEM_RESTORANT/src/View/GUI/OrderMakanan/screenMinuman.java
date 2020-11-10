/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUI.OrderMakanan;

import View.GUIMenu.Screen;
import View.GUI.Menu.screenOrderMakanan;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author A442UF
 */
public class screenMinuman {
    public screenMinuman() throws IOException{
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Minuman");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
    
        
        JLabel boba ;
        boba = new JLabel("Brown Sugar Bubble Tea");
        boba.setBounds(50, 100, 150, 30);
        frame.add(boba);
        JButton bobaImage;
        bobaImage = new JButton(new ImageIcon(resizeImage("image/boba.jpg")));
        bobaImage.setBounds(50, 130, 150, 62);
        frame.add(bobaImage);
     
        
        JLabel mactha;
        mactha = new JLabel("Mactha Latte");
        mactha.setBounds(50, 200, 100, 30);
        frame.add(mactha);
        JButton macthaImage;
        macthaImage = new JButton(new ImageIcon(resizeImage("image/matcha latte.jpg")));
        macthaImage.setBounds(50, 230, 150, 60);
        frame.add(macthaImage);
        
        JLabel iceLemon;
        iceLemon = new JLabel("Lemon Ice Tea");
        iceLemon.setBounds(50, 290, 150, 60);
        frame.add(iceLemon);
        JButton iceLemonImage;
        iceLemonImage = new JButton(new ImageIcon(resizeImage("image/ice lemon.jpg")));
        iceLemonImage.setBounds(50, 330, 150, 60);
        frame.add(iceLemonImage);
        
        JLabel jusMangga;
        jusMangga = new JLabel("Jus Mangga");
        jusMangga.setBounds(280, 100, 100, 30);
        frame.add(jusMangga);
        JButton jusManggaImage;
        jusManggaImage = new JButton(new ImageIcon(resizeImage("image/Jus mangga.jpg")));
        jusManggaImage.setBounds(280, 130, 150, 60);
        frame.add(jusManggaImage);
        
        JLabel smoothies;
        smoothies = new JLabel("Strawberry Smoothies");
        smoothies.setBounds(280, 200, 150, 30);
        frame.add(smoothies);
        JButton smoothiesImage;
        smoothiesImage = new JButton(new ImageIcon(resizeImage("image/smoothie.jpg")));
        smoothiesImage.setBounds(280, 230, 150, 60);
        frame.add(smoothiesImage);
        
        JLabel milkshake;
        milkshake = new JLabel("Milkshake Chocolate");
        milkshake.setBounds(280, 300, 150, 30);
        frame.add(milkshake);
        JButton milkshakeImage;
        milkshakeImage = new JButton(new ImageIcon(resizeImage("image/milkshake.jpg")));
        milkshakeImage.setBounds(280, 330, 150, 60);
        frame.add(milkshakeImage);
        
        JLabel labelPesanan;
        labelPesanan = new JLabel("Pesanan");
        labelPesanan.setBounds(50, 400, 70, 30);
        frame.add(labelPesanan);
        
        JTextField Pesanan;
        Pesanan = new JTextField();
        Pesanan.setBounds(50, 430, 150, 30);
        frame.add(Pesanan);
        
        JLabel labelJumlah;
        labelJumlah = new JLabel("Jumlah");
        labelJumlah.setBounds(210, 400, 70, 30);
        frame.add(labelJumlah);
     
        JTextField Jumlah;
        Jumlah = new JTextField();
        Jumlah.setBounds(210, 430, 60, 30);
        frame.add(Jumlah);
        
        JButton input;
        input = new JButton("Input");
        input.setBounds(50, 470, 100, 30);
        frame.add(input);
        
        JButton back;
        back = new JButton("Back");
        back.setBounds(355, 550, 70, 30);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new screenOrderMakanan();
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
        
        
        frame.setLayout(null);
        frame.setVisible(true);
    } 

    private Image resizeImage(String url) throws IOException {
        Image dimg = null;
        try{
            BufferedImage img = ImageIO.read(new File(url));
            dimg = img.getScaledInstance(180,57, Image.SCALE_SMOOTH);
        }catch(IOException ex){
            ex.printStackTrace(System.err);
        }
        return dimg;
    }
}

