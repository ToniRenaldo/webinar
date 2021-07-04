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
public class Lingkaran {
    double jarijari;
    final double pi=3.14;
    
    double luasLingkaran(){
        double luas=pi*jarijari*jarijari;
        return luas;
    }
    double kelLingkaran(){
        double kel=2*pi*jarijari;
        return kel;
    }
    void status(){
        System.out.println("Program Selesai...");
    }
}
