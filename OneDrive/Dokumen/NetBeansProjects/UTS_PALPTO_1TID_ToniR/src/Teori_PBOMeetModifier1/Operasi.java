/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori_PBOMeetModifier1;

/**
 *
 * @author ASUS
 */
public class Operasi {
    public float bil1;
    public float bil2;
    public float tambah;
    public float kurang;
    public float kali;
    public float bagi;
    
    public Operasi(){
        
    }
    
    public float Penjumlahan(){
        return bil1+bil2;
    }
    public float Pengurangan(){
        return bil1-bil2;
    }
    public float Perkalian(){
        return bil1*bil2;
    }
    public float Pembagian(){
        return bil1/bil2;
    }
}
