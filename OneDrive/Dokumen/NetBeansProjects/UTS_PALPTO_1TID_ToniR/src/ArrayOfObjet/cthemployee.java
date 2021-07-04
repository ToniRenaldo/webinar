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
public class cthemployee {
    int id;
    String name;
    int age;
    long salary;
    
    public void setData1(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n\t Enter Employee ID : ");
        id= Integer.parseInt(sc.nextLine());
        
        System.out.print("\n\t Enter Employee Name : ");
        name= sc.nextLine();
        
        System.out.print("\n\t Enter Employee Age : ");
        age= Integer.parseInt(sc.nextLine());
        
        System.out.print("\n\t Enter Employee Salary : ");
        salary= Integer.parseInt(sc.nextLine());
    }
    public void PutData1(){
        System.out.println("\n\t" + id + "\t" + name + "\t"+ age +"\t"+ salary);
    }
            public static void main(String[] args){
        int n=3;
        int j;
        
        cthemployee[] emp = new cthemployee[n];
        
        for (j = 0; j < n; j++) {
            emp[j] =new cthemployee();
        }
        for (j = 0; j < n; j++) {
            System.out.println("\n Enter details of "+(j+1)+" Employee\n");
            emp[j].setData1();
        }
        System.out.println("\n Details of Employee \n");
        for ( j = 0; j < n; j++) {
            emp[j].PutData1();
        }
        System.out.println("\n");
    }
}

