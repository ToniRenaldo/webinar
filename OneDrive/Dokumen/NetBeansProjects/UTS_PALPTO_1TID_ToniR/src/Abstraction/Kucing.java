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
public class Kucing extends Hewan{
    private String nama;
    Kucing (String nama){
        super("Kucing");
        this.nama=nama;
    }
    @Override
    public void suara(){
        System.out.println("Mengeong ");
    }
    public String toString(){
        return super.toString()+ " "+ nama;
    }
}
