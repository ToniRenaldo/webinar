/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
import Another_Praktikum_PBO_3.Dasar;

public class MainClassDasar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        Dasar dsr = new Dasar();
        Dasar dsr1 = new Dasar (30,15.5);
        
        System.out.print("Masukkan bilangan pertama: ");
        dsr.setBil1(in.nextInt());
        System.out.print("Masukkan bliangan kedua: ");
        dsr.setBil2(in.nextDouble());
        
        System.out.println("");
        
        System.out.println("Hasil: ");
        System.out.println("Penjumlahan: "+dsr.Penjumlahan());
        System.out.println("Pengurangan: "+dsr.Pengurangan());
        
        System.out.println("");
        
        System.out.println("Penjumlahan: "+dsr1.Penjumlahan());
        System.out.println("Pengurangan: "+dsr1.Pengurangan());
        
    }
}
