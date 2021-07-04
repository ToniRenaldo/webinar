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
public class Employee {
    private int id, age;
    private String name;
    private double salary;
    
    public Employee(){
        id=age=0;
        name="";
        salary=0;
    }
    public void getData(){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan ID Karyawan: ");
        id=Integer.parseInt(sc.nextLine());
        
        System.out.print("Masukkan Nama karyawan: ");
        name=sc.nextLine();
        
        System.out.print("Masukkan Umur karyawan: ");
        age=Integer.parseInt(sc.nextLine());
        
        System.out.print("Masukkan Gaji karyawan: ");
        salary=Double.parseDouble(sc.nextLine());
    }
    
    public void putData(){
        System.out.println(id+"\t"+name+"\t"+age+"\t"+salary);
    }
}
