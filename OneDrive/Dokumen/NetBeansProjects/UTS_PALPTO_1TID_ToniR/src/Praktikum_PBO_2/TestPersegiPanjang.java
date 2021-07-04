/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_2;

/**
 *
 * @author ASUS
 */
public class TestPersegiPanjang {
    public static void main(String[] args){
        PersegiPanjang ps1 = new PersegiPanjang();
        PersegiPanjang ps2 = new PersegiPanjang();
        PersegiPanjang pp1 = new PersegiPanjang();
        
        ps1.panjang=4;
        ps1.lebar=3;
        
        ps2.panjang=6;
        ps2.lebar=7;
        
        pp1.panjang=7;
        pp1.lebar=9;
        
        System.out.println("Persegi panjang 1 ");
        System.out.println("Panjang: "+ps1.panjang+" cm");
        System.out.println("Lebar: "+ps1.lebar+" cm");
        System.out.println("Luas Persegi Panjang 1: "+ps1.luas()+" cm2");
        ps1.keliling();
        
        System.out.println("");
        
        System.out.println("Persegi panjang 2 ");
        System.out.println("Panjang: "+ps2.panjang+" cm");
        System.out.println("Lebar: "+ps2.lebar+" cm");
        System.out.println("Luas Persegi Panjang 1: "+ps2.luas()+" cm2");
        ps2.keliling();
        
        System.out.println("");
        
        System.out.println("Persegi panjang PP1 ");
        System.out.println("Panjang: "+pp1.panjang+" cm");
        System.out.println("Lebar: "+pp1.lebar+" cm");
        System.out.println("Luas Persegi Panjang 1: "+pp1.luas()+" cm2");
        pp1.keliling();
    }
}
