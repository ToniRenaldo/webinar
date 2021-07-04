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
public class Karyawan {
    private String nama;
    private double gaji;
    
    public Karyawan () {

    }
    
    public Karyawan (String nama, double gaji) {
        this.nama=nama;
        this.gaji=gaji;
    }

    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }
}
