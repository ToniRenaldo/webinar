/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayOfObjet;

import java.util.Scanner;

/**
 *
 * @author LAB313-PC27
 */
public class TestPenumpangPesawat {
    public static void main(String[] args) {
        int n,i;
        String nama, jk, tujuan, kelas;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah penumpang yang akan diinputkan: ");
        n=Integer.parseInt(input.nextLine());
        
        
        //Deklarasi
        PenumpangPesawat penumpang[] = new PenumpangPesawat[n];
        
        //Inisiasi
        for(i=0; i<n; i++) {
            penumpang[i] = new PenumpangPesawat();
        }
        
        //Input Data
        for ( i = 0; i < n; i++) {
            System.out.println("Masukkan data penumpang "+(i+1));
            System.out.print("Masukkan nama penumpang: ");
            nama=input.nextLine();
            System.out.print("Masukkan jenis kelamin penumpang(L/P): ");
            jk=input.nextLine();
            System.out.print("Masukkan tujuan penumpang: ");
            tujuan=input.nextLine();
            System.out.print("Masukkan kelas penumpang: ");
            kelas=input.nextLine();
            
            System.out.println();
            
            penumpang[i].setNama(nama);
            penumpang[i].setJk(jk);
            penumpang[i].setTujuan(tujuan);
            penumpang[i].setKelas(kelas);
        }
        //Show Data
        System.out.println("Detail Penumpang yang telah diinputkan: ");
        System.out.println("Nama\tJK\tTujuan\tKelas");
        for ( i = 0; i < n; i++) {
            System.out.println(penumpang[i].getNama()+"\t"+penumpang[i].getJk()
                    +"\t"+penumpang[i].getTujuan()+"\t"+penumpang[i].getKelas());
        }
    }
}
