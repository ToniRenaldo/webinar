/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author ASUS
 */
public class Demo {
    public static void main(String[] args){
        Persegi persegi = new Persegi();
        persegi.setSisi(6);
        System.out.println("Keliling persegi: "+persegi.hitungKeliling());
        System.out.println("Luas persegi: "+persegi.hitungLuas());
    }
}
