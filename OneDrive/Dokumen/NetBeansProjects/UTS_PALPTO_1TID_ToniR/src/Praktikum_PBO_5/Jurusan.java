/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_5;

/**
 *
 * @author LEGION
 */
public class Jurusan {
    private String kode, nama;
    Mahasiswa mhs;
    
    public Jurusan(String kode, String nama, Mahasiswa mhs) {
        this.kode = kode;
        this.nama = nama;
        this.mhs = mhs;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("101", "Cantika");
        Jurusan j1 = new Jurusan("TI", "Teknik Informatika", m1);
        
        
        System.out.println("Mahasiswa 1");
        System.out.println("Nim          : "+j1.mhs.getNim());
        System.out.println("Nama         : "+j1.mhs.getNama());
        System.out.println("Kode Jurusan : "+j1.getKode());
        System.out.println("Jurusan      : "+j1.getNama());

        System.out.println("");
        
        Mahasiswa m2 = new Mahasiswa("112", "Joni");
        Jurusan j2 = new Jurusan("SI", "Sistem Informasi", m2);
        
        System.out.println("Mahasiswa 2");
        System.out.println("Nim          : "+j2.mhs.getNim());
        System.out.println("Nama         : "+j2.mhs.getNama());
        System.out.println("Kode Jurusan : "+j2.getKode());
        System.out.println("Jurusan      : "+j2.getNama());
    }
}
