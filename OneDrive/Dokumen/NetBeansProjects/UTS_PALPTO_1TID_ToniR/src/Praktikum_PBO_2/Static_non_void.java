/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_2;

/**
 *
 * @author ASUS
 */
public class Static_non_void {
    static int myMethod(int x){
        return 5 + x;
    }
    public static void main(String[] args){
        System.out.println("Hasil= "+myMethod(3));
    }
}
