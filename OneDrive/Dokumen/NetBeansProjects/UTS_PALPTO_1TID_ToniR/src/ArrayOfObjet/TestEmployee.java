/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayOfObjet;

/**
 *
 * @author LAB313-PC27
 */
public class TestEmployee {
    public static void main(String[] args) {
        int n=5;
        int i;
        Employee emp[]=new Employee[n];
        
        for (i = 0; i < n; i++) {
            emp[i]=new Employee();
        }
        for (i = 0; i < n; i++) {
            System.out.println("Masukkan detail data karyawan "+(i+1)+":");
            emp[i].getData();
            System.out.println();
        }
        System.out.println("Detail karyawan yang telah diinputkan: ");
        System.out.println("ID\tNama\tUmur\tGaji");
        for (i = 0; i < n; i++) {
            emp[i].putData();
        }
    }
}

