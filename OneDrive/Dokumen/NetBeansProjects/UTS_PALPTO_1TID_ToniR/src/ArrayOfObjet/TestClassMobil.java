/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayOfObjet;

/**
 *
 * @author LAB313-PC27
 */
public class TestClassMobil {
    public static void main(String[] args){
        Mobil mbl[] = new Mobil[1];
        
        for(int i = 0; i < mbl.length; i++){
            mbl [i] =new Mobil();
        }
        for (int i = 0; i < mbl.length; i++) {
            mbl[i].setData();
        }
        for (int i = 0; i < mbl.length; i++) {
            mbl[i].info();
        }
    }
}
