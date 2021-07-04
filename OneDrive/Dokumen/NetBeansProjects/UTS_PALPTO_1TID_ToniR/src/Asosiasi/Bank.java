/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asosiasi;

/**
 *
 * @author ASUS
 */
class Bank {
    private String name;
    
    //Bank Name
    Bank(String name){
        this.name=name;
    }
    public String getBankName(){
        return this.name;
    }
}
