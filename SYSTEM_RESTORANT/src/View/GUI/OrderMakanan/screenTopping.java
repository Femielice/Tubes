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
public class screenTopping {

    public screenTopping() throws IOException {
        JFrame frame = new JFrame("Menu Restorant");
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        
        JLabel label;
        label = new JLabel("Menu Topping");
        label.setBounds(200, 50, 300, 30);
        frame.add(label);
        
        JLabel keju;
        keju = new JLabel("Keju");
        keju.setBounds(50, 100, 100, 30);
        frame.add(keju);
        JButton kejuImage;
        kejuImage = new JButton(new ImageIcon(resizeImage("image/keju.jpg")));
        kejuImage.setBounds(50, 130, 150, 62);
        frame.add(kejuImage);
     
        
        JLabel telur;
        telur = new JLabel("Telur");
        telur.setBounds(50, 200, 100, 30);
        frame.add(telur);
        JButton telurImage;
        telurImage = new JButton(new ImageIcon(resizeImage("image/telur.jpg")));
        telurImage.setBounds(50, 230, 150, 60);
        frame.add(telurImage);
        
        JLabel kimchi;
        kimchi = new JLabel("Kimchi");
        kimchi.setBounds(50, 290, 150, 60);
        frame.add(kimchi);
        JButton kimchiImage;
        kimchiImage = new JButton(new ImageIcon(resizeImage("image/kimchi.jpg")));
        kimchiImage.setBounds(50, 330, 150, 60);
        frame.add(kimchiImage);
        
        JLabel oreo;
        oreo = new JLabel("Oreo");
        oreo.setBounds(280, 100, 100, 30);
        frame.add(oreo);
        JButton oreoImage;
        oreoImage = new JButton(new ImageIcon(resizeImage("image/oreo.jpg")));
        oreoImage.setBounds(280, 130, 150, 60);
        frame.add(oreoImage);
        
        JLabel mayonnaise;
        mayonnaise = new JLabel("Mayonnaise");
        mayonnaise.setBounds(280, 200, 100, 30);
        frame.add(mayonnaise);
        JButton mayonnaiseImage;
        mayonnaiseImage = new JButton(new ImageIcon(resizeImage("image/mayonnaise.jpg")));
        mayonnaiseImage.setBounds(280, 230, 150, 60);
        frame.add(mayonnaiseImage);
        
        JLabel susu;
        susu = new JLabel("Susu");
        susu.setBounds(280, 300, 100, 30);
        frame.add(susu);
        JButton susuImage;
        susuImage = new JButton(new ImageIcon(resizeImage("image/susu.jpg")));
        susuImage.setBounds(280, 330, 150, 60);
        frame.add(susuImage);
        
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
    

