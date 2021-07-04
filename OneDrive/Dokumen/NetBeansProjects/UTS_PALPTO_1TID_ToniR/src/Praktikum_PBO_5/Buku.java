package Praktikum_PBO_5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LEGION
 */
public class Buku {
    private String judul;
    private int tahunpenerbitan;
    private Penulis penulis;
    
    public Buku() {
        this.judul=judul;
        this.tahunpenerbitan=tahunpenerbitan;
        this.penulis = new Penulis();
    }
    
    public Buku(String judul, int tahunpenerbitan, Penulis penulis) {
        this.judul = judul;
        this.tahunpenerbitan = tahunpenerbitan;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahunpenerbitan() {
        return tahunpenerbitan;
    }

    public void setTahunpenerbitan(int tahunpenerbitan) {
        this.tahunpenerbitan = tahunpenerbitan;
    }

    public String getNamaPenulis() {
        return penulis.getNama();
    }
}
