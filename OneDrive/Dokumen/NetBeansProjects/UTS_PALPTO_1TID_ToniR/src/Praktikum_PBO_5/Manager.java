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
public class Manager {
    private String nama;
    private String[] karyawan = new String[5];
    private int i;
    
    public Manager() {

    }

    public Manager(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getKaryawan(int indeks) {
        return karyawan[indeks];
    }

    public void setKaryawan(String karyawan) {
        if (i < this.karyawan.length) {
            this.karyawan[i] = karyawan;
            i++;
        }
    }
}
