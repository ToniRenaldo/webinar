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
public class MainClassGrade {
    public static void main(String[] args){
        Grade g1 = new Grade(90);
        Grade g2 = new Grade(87);
        Grade g3 = new Grade(49);
        
        g1.hasil();
        System.out.println("");
        g2.hasil();
        System.out.println("");
        g3.hasil();
    }
}
