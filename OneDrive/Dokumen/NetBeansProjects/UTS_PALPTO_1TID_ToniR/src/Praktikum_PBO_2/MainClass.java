/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Lingkaran objLing1= new Lingkaran();
        Lingkaran objLing2= new Lingkaran();
        
        System.out.println("Masukkan jari-jari lingkaran: ");
        double jarijari=input.nextDouble();
        
        objLing1.jarijari=jarijari;
        objLing2.jarijari=jarijari;
        
        System.out.println("Luas Lingkaran: "+objLing1.luasLingkaran());
        System.out.println("Keliling Lingkaran: "+objLing2.kelLingkaran());
        objLing1.status();
    }
}
