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
public class MainClassBola {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Bola objBola1 = new Bola();
        Bola objBola2 = new Bola();
        
        System.out.print("Masukkan jari-jari bola: ");
        double jarijari=input.nextDouble();
        
        objBola1.jarijari=jarijari;
        objBola2.jarijari=jarijari;
        
        System.out.println("Luas bola: "+objBola1.luasBola(5));
        System.out.println("Volume bola: "+objBola2.volBola());
    }
}
