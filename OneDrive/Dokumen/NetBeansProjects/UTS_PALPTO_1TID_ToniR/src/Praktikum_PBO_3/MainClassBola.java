/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

/**
 *
 * @author ASUS
 */
public class MainClassBola {
    public static void main(String[] args){
        Bola a1 = new Bola(4,"Bola Pimpong");
        Bola a2 = new Bola(10,"Bola Basket");
        
        System.out.println("Keadaan Awal");
        System.out.println("jari-jari: "+a1.getJarijari());
        System.out.println("Jenis Bola: "+a1.getJenis());
        System.out.println("Volume Bola: "+a1.volbola());
        
        System.out.println("");
        System.out.println("jari-jari: "+a2.getJarijari());
        System.out.println("Jenis Bola: "+a2.getJenis());
        System.out.println("Volume Bola: "+a2.volbola());
        
        a1.setJarijari(20); 
        a2.setJarijari(2);
        
        a2.setJenis("Kelereng");
        
        System.out.println("");
        
        System.out.println("Keadaan Setelah Perubahan");
        System.out.println("jari-jari: "+a1.getJarijari());
        System.out.println("Jenis Bola: "+a1.getJenis());
        System.out.println("Volume Bola: "+a1.volbola());
        
        System.out.println("");
        
        System.out.println("jari-jari: "+a2.getJarijari());
        System.out.println("Jenis Bola: "+a2.getJenis());
        System.out.println("Volume Bola: "+a2.volbola());
    }
}
