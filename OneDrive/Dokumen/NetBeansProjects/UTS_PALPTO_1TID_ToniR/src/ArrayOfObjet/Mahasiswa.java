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
public class Mahasiswa {
    Scanner input = new Scanner (System.in);
    
    public int nim;
    public String nama, prodi;
    
    Mahasiswa(){
        this.nim=0;
        this.nama="";
        this.prodi="";
    }
    void getMhs(){
        System.out.print("Masukkan NIM mahasiswa: ");
        nim=Integer.parseInt(input.nextLine());
        
        System.out.print("Masukkan Nama Mahasiswa: ");
        nama=input.nextLine();
        
        System.out.print("Pilih Program Pendidikan: ");
        prodi=input.nextLine();
    }
    
    void setMhs(){
        System.out.println(nim+"\t"+nama+"\t"+prodi);
    }
}
