/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_2;

/**
 *
 * @author ASUS
 */
public class GanjilOrGenap_V2 {
    int num;
    
    String Ganjil_Genap(){
        String desc="";
        
        if(num % 2 == 0)
            desc="even";
        else
            desc="odd";
        return desc;
        }
        public static void main(String [] args) {
            GanjilOrGenap_V2 obj = new GanjilOrGenap_V2();    
            obj.num = 25;
            System.out.println(obj.num+" Entered number is "+obj.Ganjil_Genap());
        }
}

