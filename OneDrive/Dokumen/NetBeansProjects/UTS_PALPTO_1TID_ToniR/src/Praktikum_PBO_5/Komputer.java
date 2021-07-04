/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_5;

/**
 *
 * @author ASUS
 */
public class Komputer {
    private String merk, tipe;
    private Keyboard keyboard;
    private Cpu cpu;
    private Mouse mouse;

    public Komputer() {
        this.keyboard = new Keyboard();
        this.mouse = new Mouse();
        this.cpu = new Cpu();
        merk = tipe = "";
    }
    
    public Komputer(String merk, String tipe, Keyboard keyboard,
            Cpu cpu, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.cpu = cpu;
        this.merk = merk;
        this.tipe = tipe;
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
    public String getTipeMouse() {
        return mouse.getTipe();
    }

    public String getMerkMouse() {
        return mouse.getMerk();
    }
    
    public String getTipeCpu() {
        return cpu.getTipe();
    }

    public String getMerkCpu() {
        return cpu.getMerk();
    }
    
    public String getTipeKeyboard() {
        return keyboard.getTipe();
    }

    public String getMerkKeyboard() {
        return keyboard.getMerk();
    }
}
