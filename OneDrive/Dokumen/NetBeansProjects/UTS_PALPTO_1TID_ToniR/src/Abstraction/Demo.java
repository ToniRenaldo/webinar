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
public class Demo {
    public static void main(String [] args){
        PersegiPanjang pp = new PersegiPanjang(5,3);
        System.out.print("Luas Panjang Persegi :");
        System.out.println(pp.getLuas()+" cm");
    }
}
