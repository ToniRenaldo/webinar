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
public class Anjing extends Hewan{
    private String nama;
    Anjing (String nama){
        super("Anjing");
        this.nama=nama;
    }
    @Override
    public void suara(){
        System.out.println("Menggong-gong ");
    }
    public String toString(){
        return super.toString()+ " "+ nama;
    }
}
