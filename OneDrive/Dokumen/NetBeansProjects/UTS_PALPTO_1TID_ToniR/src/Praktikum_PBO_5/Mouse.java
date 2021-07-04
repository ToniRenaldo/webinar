/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_5;

/**
 *
 * @author ASUS
 */
public class Mouse {
    private String merk, tipe;

    public Mouse() {
        merk = tipe = "";
    }
    
    public Mouse(String merk, String tipe) {
        this.merk = merk;
        this.tipe = tipe;
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
}
