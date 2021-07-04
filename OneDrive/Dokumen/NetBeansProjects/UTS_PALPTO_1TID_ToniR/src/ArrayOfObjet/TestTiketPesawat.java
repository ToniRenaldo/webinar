package ArrayOfObjet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author LAB313-PC27
 */
public class TestTiketPesawat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b;
        
        System.out.print("Masukkan jumlah penumpang: ");
        b = Integer.parseInt(input.nextLine());
        
        TiketPesawat obj[]=new TiketPesawat[b];
        
        for (int i = 0; i < b; i++) {
            obj[i]=new TiketPesawat();
        }
        for (int i = 0; i < b; i++) {
            System.out.println("Penumpang ke "+(i+1)+":");
            obj[i].getData();
            System.out.println();
        }
        for (int i = 0; i < b; i++) {
            System.out.println("Berikut detail penerbangan: ");
            System.out.println("ID\tNama\tMaskapai\tKursi\tHarga\tJadwal\tKonfirmasi");
            obj[i].setData();
        }
        
    }
}
