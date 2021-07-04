/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasInheritance;

/**
 *
 * @author LAB313-PC27
 */
public class Programmer extends Pegawai {
    String name;
    double gajiBonus=2000000, totalGaji;

public Programmer(){
    super.info();
    System.out.println("Ini adalah class Programmer");
    this.name="Programmer";
    this.gaji=5000000;
}
public void monitoring(){
    System.out.println("Programmer melakukan monitoring sistem perusahaan");
}
public void service(){
    System.out.println("Programmer melayani error complain");
}
public void total(double gajiTetap){
    this.totalGaji=gaji+gajiBonus;
    System.out.println("Total gaji : "+totalGaji);
}
}
