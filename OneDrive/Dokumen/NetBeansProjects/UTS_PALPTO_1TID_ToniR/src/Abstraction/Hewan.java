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
public abstract class Hewan {
    private String jenis;
    Hewan(String jenis){
        this.jenis = jenis;
    }
    protected abstract void suara();
    
    public String toString(){
        return "Seekor "+jenis;
    }
}
