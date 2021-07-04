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
public class TelevisiA implements Control {
    String[] channelTv = {"RCTI", "SCTV", "INDOSIAR", "TRANS TV", "TPI"};
    @Override
    public void pindahChannel(int channel) {
        System.out.println("Pindah Channel pada TV A ke : "+channelTv[channel]);
    }

    @Override
    public void PerbesarVolume(int intensitas) {
        System.out.println("Perbesar intensintas volume pada tv A sebanyak : "+intensitas); 
    }

    @Override
    public void PerkecilVolume(int intensitas) {
        System.out.println("Perkecil intensitas volume Pada tv A sebesar : "+intensitas);
    }
}