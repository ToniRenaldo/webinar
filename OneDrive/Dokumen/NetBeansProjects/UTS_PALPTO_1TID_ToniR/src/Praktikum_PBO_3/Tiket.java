/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

/**
 *
 * @author ASUS
 */
public class Tiket {
    private String maskapai;
    private String no_kursi;
    private String keberangkatan;
    private String tanggal;
    
    Tiket(){
        maskapai="Garuda Indonesia";
        no_kursi=null;
        keberangkatan=null;
        tanggal=null;
    }
    Tiket(String maskapai,String no_kursi, String keberangkatan, String tanggal){
        this.maskapai=maskapai;
        this.no_kursi=no_kursi;
        this.keberangkatan=keberangkatan;
        this.tanggal=tanggal;
    }
    Tiket(Tiket tik){
        this.maskapai = tik.maskapai;
        this.no_kursi = tik.no_kursi;
        this.keberangkatan = tik.keberangkatan;
        this.tanggal = tik.tanggal;
    }
    
    public void setMaskapai(String maskapai){
        this.maskapai=maskapai;
    }
    public void setKursi(String no_kursi){
        this.no_kursi=no_kursi;
    }
    public void setKeberangkatan(String keberangkatan){
        this.keberangkatan=keberangkatan;
    }
    public void setTanggal(String tanggal){
        this.tanggal=tanggal;
    }
    public String getMaskapai(){
        return maskapai;
    }
    public String getKursi(){
        return no_kursi;
    }
    public String getKeberangkatan(){
        return keberangkatan;
    }
    public String getTanggal(){
        return tanggal;
    }
}
