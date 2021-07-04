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
public class TestAccount {
    public static void main(String[] args){
       Account acc1=new Account();
       Account acc2=new Account();
       Account acc3=new Account();
       Account acc4=new Account();
       Account acc5=new Account();
       
       acc1.setNewData(100,110);
       acc2.setNewData(100,120);
       acc4.setNewData(100,110);
       
        System.out.println("Nilai Atribut pada object 1: ");
        acc1.showData();
        System.out.println("Nilai Atribut pada object 2: ");
        acc2.showData();
        System.out.println("Nilai Atribut pada object 3: ");
        acc3.showData();
        System.out.println("Nilai Atribut pada object 4: ");
        acc4.showData();
        System.out.println("Nilai Atribut pada object 5: ");
        acc5.showData();
    }
}
