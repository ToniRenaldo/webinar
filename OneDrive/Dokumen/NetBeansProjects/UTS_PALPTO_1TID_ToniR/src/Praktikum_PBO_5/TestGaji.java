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
public class TestGaji {
    public static void main(String[] args) {
        Manager m = new Manager("Deddy");
        
        Karyawan p1 = new Karyawan("Budi", 3000000);
        m.setKaryawan(p1.getNama());
        
        Karyawan p2 = new Karyawan("Winson", 7000000);
        m.setKaryawan(p2.getNama());
        
        Karyawan p3 = new Karyawan("Raze", 6000000);
        m.setKaryawan(p3.getNama());
        
        Karyawan p4 = new Karyawan("Ino", 5000000);
        m.setKaryawan(p4.getNama());
        
        Karyawan p5 = new Karyawan("Dita", 6500000);
        m.setKaryawan(p5.getNama());
        
        System.out.println("Manager : "+m.getNama());
        for (int j = 0; j < 5; j++) {
            System.out.println("Nama Karyawan "+m.getKaryawan(j));
        }
    }
}
