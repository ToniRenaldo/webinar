/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

import Abstraction.Mahasiswa1;
import Abstraction.Mahasiswa2;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class demoNilai {
    public static void main(String[] args) {
        int max;
        double rata_rata;

        Scanner input = new Scanner(System.in);
        Mahasiswa1 mhs1 = new Mahasiswa1();
        Mahasiswa2 mhs2 = new Mahasiswa2();
        
        System.out.println("----------Data Mahasiswa----------");
        System.out.print("Nama Mahasiswa 1: ");
        mhs1.setNama(input.nextLine());

        for (int i = 0; i < 3; i++) {
            mhs1.setNilai(i);
        }
        System.out.println("Nilai tertinggi\t = " + mhs1.tertinggi());
        System.out.println();
        System.out.print("Nama Mahasiswa 2 : ");
        mhs2.setNama(input.nextLine());

        for (int i = 0; i < 4; i++) {
            mhs2.setNilai(i);
        }
        System.out.println("Nilai tertinggi\t = " + mhs2.tertinggi());

        if (mhs1.tertinggi() > mhs2.tertinggi()) {
            max = mhs1.tertinggi();
        } else {
            max = mhs2.tertinggi();
        }

        rata_rata = (mhs1.rata() + mhs2.rata()) / 2;
        System.out.println("-----------------------------------------");
        System.out.println("Nilai tertinggi dari semua mahasiswa: " + max);
        System.out.println("Rata-Rata Semua nilai dari mahasiswa: " + rata_rata);
    } 
}
