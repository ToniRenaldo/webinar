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

public class Bola {
    private int jarijari;
    private String jenis;
    
    Bola(){
        
    }
    Bola(int jarijari, String jenis){
        this.jarijari = jarijari;
        this.jenis=jenis;
    }
    Bola(Bola bo){
        this.jarijari=bo.jarijari;
        this.jenis=bo.jenis;
    }
 
    
    public float volbola(){
        double vol= 4/3*3.14*jarijari*jarijari*jarijari;
        return (float) vol;
    }
    public void setJarijari(int jarijari){
        this.jarijari=jarijari;
    }
    public int getJarijari(){
        return jarijari;
    }
    public void setJenis(String jenis){
        this.jenis=jenis;
    }
    public String getJenis(){
        return jenis;
    }
}
