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
public class Bola {
    double jarijari;
    final double phi=3.14;
    
    double luasBola(double jarijari){
        double luas = 4*phi*jarijari*jarijari;
        return luas;
    }
    double volBola(){
        double vol= 4/3*phi*jarijari*jarijari*jarijari;
        return vol;
    }
}
