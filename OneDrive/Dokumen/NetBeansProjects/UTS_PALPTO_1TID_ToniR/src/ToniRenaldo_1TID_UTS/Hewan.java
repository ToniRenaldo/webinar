/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToniRenaldo_1TID_UTS;

/**
 *
 * @author ASUS
 */
public class Hewan {
    private String nama;
    private String habitat;
    private String namalatin;
    
    public Hewan(){
        
    }
    
    public Hewan(String nama, String habitat, String namalatin){
        this.nama = nama;
        this.habitat = habitat;
        this.namalatin = namalatin;
    }
    
    public void cetak(){
        System.out.println("Nama: "+nama);
        System.out.println("Habitat ditinggal: "+habitat);
        System.out.println("Nama Latin: "+namalatin);
    }
}
