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
public class Parameter {
    static void myMethod(String fname, int age){
        System.out.println(fname+" is "+age);
    }
    public static void main(String[] args){
        myMethod("Liam",5);
        myMethod("Jenny",8);
        myMethod("Anja",31);
    }
}
