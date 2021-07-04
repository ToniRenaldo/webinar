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
public class Reptil extends Hewan{
    private String jenis;
    
    public Reptil(String jenis){
        this.jenis=jenis;
    }
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Jenis reptil: "+jenis);
    }
}
