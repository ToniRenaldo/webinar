/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang extends Pola {
    private int panjang,lebar;
    
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public double getLuas(){
        return panjang * lebar;
    }
    public String toString(){
        return "Persegi Panjang";
    }
}
