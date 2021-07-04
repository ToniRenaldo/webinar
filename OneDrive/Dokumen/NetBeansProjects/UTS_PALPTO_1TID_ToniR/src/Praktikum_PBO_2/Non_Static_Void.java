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
public class Non_Static_Void {
    public void fullThrottle(){
        System.out.println("The car is going as fast as it has!");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is : "+ maxSpeed);
    }
    public static void main(String[] args){
        Non_Static_Void myCar = new Non_Static_Void();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
