/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_5;

import Praktikum_PBO_5.Cpu;
import Praktikum_PBO_5.Keyboard;
import Praktikum_PBO_5.Komputer;
import Praktikum_PBO_5.Mouse;

/**
 *
 * @author ASUS
 */
public class TestKomputer {
    public static void main(String[] args) {
        Komputer kom = new Komputer("Asus", "A123F", new Keyboard("Asus",
                "KR89"), new Cpu("Intel", "C23G"), new Mouse("Asus",
                        "M45H"));
        
        System.out.println("Tipe Komputer: " + kom.getTipe());
        System.out.println("Merk Komputer: " + kom.getMerk());
        System.out.println("Tipe CPU: " + kom.getTipeCpu());
        System.out.println("Merk CPU: " + kom.getMerkCpu());
        System.out.println("Tipe Mouse: " + kom.getTipeMouse());
        System.out.println("Merk Mouse: " + kom.getMerkMouse());
        System.out.println("Tipe Keyboard: " + kom.getTipeKeyboard());
        System.out.println("Merk keyboard: " + kom.getMerkKeyboard());
    }
}