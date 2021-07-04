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
public class Grade {
    String huruf,kategori;
    int nilai;
    double bobot;
    
    Grade(int nilai){
        this.nilai = nilai;
        
    }
    void hasil(){
        if (nilai>=81 && nilai<=100){
            huruf = "A";
            bobot = 4;
            kategori = "Istimewa";
        }
        else if(nilai>=76 && nilai<=80){
            huruf = "AB";
            bobot = 3.5;
            kategori = "Amat Baik";
        }
        else if(nilai>=66 && nilai<=75){
            huruf = "B";
            bobot = 3;
            kategori = "Baik";
        }
        else if(nilai>=61 && nilai<=65){
            huruf = "BC";
            bobot = 2.5;
            kategori = "Cukup Baik";
        }
        else if(nilai>=51 && nilai<=60){
            huruf = "C";
            bobot = 2;
            kategori = "Cukup";
        }
        else if(nilai<=50){
            huruf = "F";
            bobot = 0;
            kategori = "Tidak Luluis";
        }
        System.out.println("Nilai Angka: "+nilai);
        System.out.println("Nilai Huruf: "+huruf);
        System.out.println("Bobot: "+bobot);
        System.out.println("Kategori: "+kategori);
    }
}
