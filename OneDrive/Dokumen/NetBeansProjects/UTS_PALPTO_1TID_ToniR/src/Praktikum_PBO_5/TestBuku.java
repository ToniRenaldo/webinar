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
public class TestBuku {
    public static void main(String[] args) {
        Buku buku = new Buku("Laskar Pelangi", 2011, new Penulis("Nidji"));
        
        System.out.println("Judul Buku       : " + buku.getJudul());
        System.out.println("Tahun Penerbitan : " + buku.getTahunpenerbitan());
        System.out.println("Penulis          : " + buku.getNamaPenulis());
    }
}
