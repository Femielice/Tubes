/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Menu;

/**
 *
 * @author A442UF
 */
public class stockMakanan {
    String ID_Makanan;
    private String Nama;
    private int Jumlah;
    private double Harga;
    
    public stockMakanan(){
    }

    public String getID_Makanan() {
        return ID_Makanan;
    }

    public void setID_Makanan(String ID_Makanan) {
        this.ID_Makanan = ID_Makanan;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }

    public double getHarga() {
        return Harga;
    }

    public void setHarga(double Harga) {
        this.Harga = Harga;
    }
    
    
}
