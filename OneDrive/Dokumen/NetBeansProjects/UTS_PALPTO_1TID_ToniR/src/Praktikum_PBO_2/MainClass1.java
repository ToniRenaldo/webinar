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
public class MainClass1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jarijari=input.nextDouble();
        
        Lingkaran1 objLing1= new Lingkaran1(jarijari);
        Lingkaran1 objLing2= new Lingkaran1(jarijari);
        
        System.out.println("Luas Lingkaran: "+String.format("%,.2f", objLing1.luasLingkaran()));
        System.out.println("Keliling Lingkaran: "+String.format("%,.2f", objLing2.kelLingkaran()));
    }
}
