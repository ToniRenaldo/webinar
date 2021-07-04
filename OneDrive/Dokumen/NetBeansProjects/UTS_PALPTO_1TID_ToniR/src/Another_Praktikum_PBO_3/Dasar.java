/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Another_Praktikum_PBO_3;

/**
 *
 * @author ASUS
 */
public class Dasar {
    public int bil1;
    public double bil2;
    
    public Dasar(){
        
    }
    public Dasar(int bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    public double Penjumlahan(){
        return bil1+bil2;
    }
    public double Pengurangan(){
        return bil1-bil2;
    }
    public void setBil1(int bil1){
        this.bil1=bil1;
    }
    public void setBil2(double bil2){
        this.bil2=bil2;
    }
}
