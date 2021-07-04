/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritancce;

/**
 *
 * @author LAB313-PC27
 */
public class Dog extends Animal{
    protected Dog(){
        super();
        System.out.println("I am a dog");
    }
    @Override
    protected void eat(){
        super.eat();
        System.out.println("I eat dog food");
    }
    protected void bark(){
        System.out.println("I can bark");
    }
}
