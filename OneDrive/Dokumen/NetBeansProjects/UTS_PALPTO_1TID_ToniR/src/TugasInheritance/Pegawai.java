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
public class Pegawai {
    double gaji=5000000;
    
public void Pegawai(){

}
protected String info(){
    System.out.println("Ini adalah class Pegawai");
    return null;
}
public void inTime(String jenis){
    System.out.println(jenis+" datang tepat waktu");
}
public void absensi(String jenis){
    System.out.println(jenis+" sudah mengisi absensi");
}
public void meeting(String jenis){
    System.out.println(jenis+" melakukan meeting mingguan");
}
}
