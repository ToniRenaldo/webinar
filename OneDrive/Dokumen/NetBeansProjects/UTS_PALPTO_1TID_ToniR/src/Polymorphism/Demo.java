/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author LAB313-PC27
 */
public class Demo {
    public void displayPattern(){
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
    }
    
    public void displayPattern(char symbol){
        for (int i = 0; i < 10; i++) {
            System.out.println(symbol);
        }
    }
}
