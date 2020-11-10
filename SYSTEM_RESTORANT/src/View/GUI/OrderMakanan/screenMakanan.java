/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUI.OrderMakanan;

import View.GUIMenu.Screen;
import View.GUI.Menu.screenOrderMakanan;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author A442UF
 */
public class screenMakanan {
    public screenMakanan() throws IOException{
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Makanan");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
    
        
        JLabel kimbab;
        kimbab = new JLabel("Kimbap");
        kimbab.setBounds(50, 100, 100, 30);
        frame.add(kimbab);
        JButton kimbabImage;
        kimbabImage = new JButton(new ImageIcon(resizeImage("image/kimbap.jpg")));
        kimbabImage.setBounds(50, 130, 150, 62);
        frame.add(kimbabImage);
     
        
        JLabel tteoboki;
        tteoboki = new JLabel("Tteokbokki");
        tteoboki.setBounds(50, 200, 100, 30);
        frame.add(tteoboki);
        JButton tteobokiImage;
        tteobokiImage = new JButton(new ImageIcon(resizeImage("image/tteokbokki.jpg")));
        tteobokiImage.setBounds(50, 230, 150, 60);
        frame.add(tteobokiImage);
        
        JLabel burger;
        burger = new JLabel("Burger");
        burger.setBounds(50, 290, 150, 60);
        frame.add(burger);
        JButton burgerImage;
        burgerImage = new JButton(new ImageIcon(resizeImage("image/burger.jpg")));
        burgerImage.setBounds(50, 330, 150, 60);
        frame.add(burgerImage);
        
        JLabel spaghetti;
        spaghetti = new JLabel("Spaghetti");
        spaghetti.setBounds(280, 100, 100, 30);
        frame.add(spaghetti);
        JButton spaghettiImage;
        spaghettiImage = new JButton(new ImageIcon(resizeImage("image/spaghetti.jpg")));
        spaghettiImage.setBounds(280, 130, 150, 60);
        frame.add(spaghettiImage);
        
        JLabel kentangGoreng;
        kentangGoreng = new JLabel("Kentang Goreng");
        kentangGoreng.setBounds(280, 200, 100, 30);
        frame.add(kentangGoreng);
        JButton kentangGorengImage;
        kentangGorengImage = new JButton(new ImageIcon(resizeImage("image/kentang goreng.jpg")));
        kentangGorengImage.setBounds(280, 230, 150, 60);
        frame.add(kentangGorengImage);
        
        JLabel friedChicken;
        friedChicken = new JLabel("Fried Chicken");
        friedChicken.setBounds(280, 300, 100, 30);
        frame.add(friedChicken);
        JButton friedChickenImage;
        friedChickenImage = new JButton(new ImageIcon(resizeImage("image/fried chicken.jpg")));
        friedChickenImage.setBounds(280, 330, 150, 60);
        frame.add(friedChickenImage);
        
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
