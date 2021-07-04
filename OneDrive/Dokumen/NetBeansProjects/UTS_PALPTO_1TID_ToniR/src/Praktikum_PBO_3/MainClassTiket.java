/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

/**
 *
 * @author ASUS
 */
public class MainClassTiket {
    public static void main(String[] args){
        Tiket tkt1 = new Tiket();
        Tiket tkt2 = new Tiket("Citilink","A5","05:30","01-April-2020");
        
        System.out.println("Tiket 1");
        System.out.println("Maskapai: "+tkt1.getMaskapai());
        System.out.println("Nomor Kursi: "+tkt1.getKursi());
        System.out.println("Keberangkatan: "+tkt1.getKeberangkatan());
        System.out.println("Tanggal: "+tkt1.getTanggal());
        
        System.out.println("");
        
        System.out.println("Tiket 2");
        System.out.println("Maskapai: "+tkt2.getMaskapai());
        System.out.println("Nomor Kursi: "+tkt2.getKursi());
        System.out.println("Keberangkatan: "+tkt2.getKeberangkatan());
        System.out.println("Tanggal: "+tkt2.getTanggal());
        
        tkt1.setKursi("C12");
        tkt1.setKeberangkatan("11.00");
        tkt1.setTanggal("01-April-2020");
        
        tkt2.setKeberangkatan("13:00");
        
        System.out.println("");
        
        System.out.println("Update Data: ");
        System.out.println("Tiket 1");
        System.out.println("Maskapai: "+tkt1.getMaskapai());
        System.out.println("Nomor Kursi: "+tkt1.getKursi());
        System.out.println("Keberangkatan: "+tkt1.getKeberangkatan());
        System.out.println("Tanggal: "+tkt1.getTanggal());
        
        System.out.println("");
        
        System.out.println("Tiket 2");
        System.out.println("Maskapai: "+tkt2.getMaskapai());
        System.out.println("Nomor Kursi: "+tkt2.getKursi());
        System.out.println("Keberangkatan: "+tkt2.getKeberangkatan());
        System.out.println("Tanggal: "+tkt2.getTanggal());
    }
}
