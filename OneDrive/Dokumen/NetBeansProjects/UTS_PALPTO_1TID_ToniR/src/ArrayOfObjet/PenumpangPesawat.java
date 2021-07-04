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
public class PenumpangPesawat {
    private String nama, jk, tujuan, kelas;
    
    public PenumpangPesawat(){
        this.nama="";
        this.jk="";
        this.tujuan="";
        this.kelas="";      
    }   
    public PenumpangPesawat(String nama, String jk, String tujuan, String kelas){
        this.nama=nama;
        this.jk=jk;
        this.tujuan=tujuan;
        this.kelas=kelas;
    }    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getJk() {
        return jk;
    }
    
    public void setJk(String jk){
        this.jk=jk;
    }
    
    public String getTujuan() {
        return tujuan;
    }
    
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    
    public String getKelas() {
        return kelas;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
   
