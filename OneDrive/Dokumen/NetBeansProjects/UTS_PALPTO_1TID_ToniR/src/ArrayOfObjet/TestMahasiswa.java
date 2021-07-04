package ArrayOfObjet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LAB313-PC27
 */
public class TestMahasiswa {
    public static void main(String[] args) {
        int b=2;
        int i;
        Mahasiswa obeje[]=new Mahasiswa[b];
        
        for (i = 0; i < b; i++) {
           obeje[i]=new Mahasiswa();
        }
        for (i = 0; i < b; i++) {
            System.out.println("Masukkan data Mahasiswa "+(i+1)+":");
            obeje[i].getMhs();
            System.out.println();
        }
        System.out.println("Detail mahasiswa yang telah diinputkan: ");
        System.out.println("NIM\tNama\tProdi");
        for (i = 0; i < b; i++) {
            obeje[i].setMhs();
        }
    }
}
