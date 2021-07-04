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
public class Kambing extends Hewan{
    private String nama;
    Kambing (String nama){
        super("Kambing");
        this.nama=nama;
    }
    @Override
    public void suara(){
        System.out.println("Mengembik ");
    }
    public String toString(){
        return super.toString()+ " "+ nama;
    }
}
