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
public class TestPersegiPanjang {
     public static void main(String[] args){
        int jumlah;
       
        Scanner input = new Scanner(System.in);
       
        System.out.print("Inputkan Jumlah array :  ");
        jumlah = Integer.parseInt(input.nextLine());
       
        PersegiPanjang pp[] = new PersegiPanjang[jumlah];
       
        for (int i = 0; i < jumlah; i++) {
            pp[i] = new PersegiPanjang();
        }
       
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Array " +(i+1)+ ":");
            pp[i].getPP();
            pp[i].kll();
            pp[i].luas();
            pp[i].toString();
            pp[i].info();
            System.out.println();
        }
        System.out.println("Detail Persegi Panjang yang akan diinputkan : ");
        System.out.println("Panjang\tLebar\tLuas\tKeliling");
        for (int i = 0; i < jumlah; i++) {
            pp[i].info();
        }
    }
}
