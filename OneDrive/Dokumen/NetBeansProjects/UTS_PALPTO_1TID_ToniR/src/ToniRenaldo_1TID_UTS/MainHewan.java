/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToniRenaldo_1TID_UTS;

/**
 *
 * @author ASUS
 */
public class MainHewan {
    public static void main(String[] args){
        Mamalia mama = new Mamalia("Mamalia");
        Reptil reptil = new Reptil("Reptilia");
        
        mama.cetak();
        System.out.println("");
        reptil.cetak();
    }
}
