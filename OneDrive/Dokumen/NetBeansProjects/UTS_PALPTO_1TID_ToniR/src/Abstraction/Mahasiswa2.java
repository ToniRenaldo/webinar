/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

import Abstraction.nilai;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Mahasiswa2 extends nilai {
    Scanner input = new Scanner(System.in);
    private String nama;
    private int matkul[] = new int[4];
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int[] getMatkul() {
        return matkul;
    }
    @Override
    public int tertinggi() {
        int max = 0;
        for (int i = 0; i < 4; i++) {
            if (max < this.matkul[i]) {
                max = this.matkul[i];
            }
        }
        return max;
    }

    @Override
    public double rata() {
        double rata_rata = 0;
        for (int i = 0; i < 4; i++) {
            rata_rata += this.matkul[i];
        }
        rata_rata = rata_rata / 4;
        return rata_rata;
    }

    public void setNilai(int a) {
        System.out.print("Nilai ke-" + (a + 1) + " = ");
        this.matkul[a] = Integer.parseInt(input.nextLine());
    }
}
