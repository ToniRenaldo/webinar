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
public class Mobil {
    protected String warna;
    protected String merek;
    
    public Mobil(){
        this.warna="";
        this.merek="";
    }
    protected void beriWarna(){
        System.out.println("Warna Mobil ini adalah "+warna);
    }
    protected void beriMerek(){
        System.out.println("Merek Mobil ini adalah "+merek);
    }
}
