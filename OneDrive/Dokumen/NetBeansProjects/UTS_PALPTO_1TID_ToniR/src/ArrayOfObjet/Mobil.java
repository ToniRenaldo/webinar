/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayOfObjet;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB313-PC27
 */
public class Mobil {
    String warna;
    String merk;
    
    public Mobil(){
        
    }
    public void setData(){
        warna = JOptionPane.showInputDialog("Inputkan warna kendaraan : ");
        merk = JOptionPane.showInputDialog("Inputkan merk kendaraan : ");
    }
    public void info(){
        System.out.println("Warna Mobil : " +warna+ "\nMerk Mobil : "+ merk);
    }
}
