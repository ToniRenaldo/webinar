/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori_PBOMeetModifier2;

/**
 *
 * @author ASUS
 */
import Teori_PBOMeetModifier1.Operasi;

public class MainClassOperasi{
     public static void main(String[] args) {
        
        Operasi op = new Operasi();
        
        // memberi nilai
        op.bil1 = 4;
        op.bil2 = 5;
        
        System.out.println("Output :");
        System.out.println("Penjumlahan : "+op.Penjumlahan());
        System.out.println("Pengurangan : "+op.Pengurangan());
        System.out.println("Perkalian   : "+op.Perkalian());
        System.out.println("Pembagian   : "+op.Pembagian());
    }
}