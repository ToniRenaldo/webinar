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
public class PersegiPanjang {
    private int panjang, lebar, luas, kll;
    
    PersegiPanjang(){
        panjang=0;
        lebar=0;
        luas=0;
        kll=0;
    }
    public String toString(){
        return panjang+" "+lebar+" "+luas+" "+kll;
    }
    public void getPP(){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan Panjang : ");
        panjang = Integer.parseInt(sc.nextLine());
        
        System.out.print("Masukkan Lebar: ");
        lebar = Integer.parseInt(sc.nextLine());
    }
    public double kll(){
        kll = 2 * panjang + 2 * lebar;
        return kll;
    }
    public double luas(){
        luas = panjang * lebar;
        return luas;
    }
    public void info(){
        System.out.println(panjang+"\t"+lebar+"\t"+luas+"\t"+kll);
    }
}
