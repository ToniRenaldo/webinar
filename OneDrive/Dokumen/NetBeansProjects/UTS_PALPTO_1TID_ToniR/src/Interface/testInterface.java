/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author ASUS
 */
public class testInterface {
    public static void main(String [] args){
        TelevisiA tvA = new TelevisiA();
        TelevisiB tvB = new TelevisiB();
        RemoteControl rc= new RemoteControl();
        
        rc.kirimPerintahKeTv(RemoteControl.PINDAH_CHANNEL, tvA, 2);
        rc.kirimPerintahKeTv(RemoteControl.PERBESAR_VOLUME, tvA, 5);
        
        
        rc.kirimPerintahKeTv(RemoteControl.PERBESAR_VOLUME, tvB, 1);
        rc.kirimPerintahKeTv(RemoteControl.PERKECIL_VOLUME, tvB, 3);   
    }
}
