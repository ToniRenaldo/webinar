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
public class Mamalia extends Hewan {
    private String jenis;
    
    public Mamalia(String jenis){
        this.jenis=jenis;
    }
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Jenis mamalia: "+jenis);
    }
}
