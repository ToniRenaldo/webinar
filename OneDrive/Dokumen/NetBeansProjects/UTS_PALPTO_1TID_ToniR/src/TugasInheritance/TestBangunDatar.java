/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasInheritance;

/**
 *
 * @author LAB313-PC27
 */
public class TestBangunDatar {
    public static void main(String[] args){
        Segitiga s1 = new Segitiga();
        Segitiga s2 = new Segitiga();
        
        s1.nama="Siku-siku";
        s1.alas=10;
        s1.tinggi=15;
        
        System.out.println("Nama Segitiga: "+s1.nama);
        System.out.println("Luas Segitiga: "+s1.luas());
    
        System.out.println();
        
        s2.nama="Sama sisi";
        s2.sisi1=s2.sisi2=s2.sisi3=100;
        System.out.println("Nama Segitiga: "+s2.nama);
        System.out.println("Keliling Segitiga: "+s2.keliling());
        
        System.out.println();
        
        Persegi p1 = new Persegi();
        Persegi p2 = new Persegi();
        
        p1.sisi1=5;
        p1.sisi2=4;
        
        System.out.println("Luas Persegi: "+p1.luas());
    
        System.out.println();
        p2.sisi1=8;
        System.out.println("Keliling Persegi: "+p2.keliling());
        
        System.out.println();
        
        Lingkaran l1 = new Lingkaran();
        Lingkaran l2 = new Lingkaran();
        
        l1.r1=5;
        l1.r2=4;
        l1.phi=3.14;
        
        System.out.println("Luas Lingkaran: "+l1.luas());
    
        System.out.println();
        l2.r1=6;
        l2.phi=3.14;
        System.out.println("Keliling Lingkaran: "+l2.keliling());
    }
}
