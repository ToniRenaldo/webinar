/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToniRenaldo_1TID_kuisPPBO_sesi1;

/**
 *
 * @author ASUS
 */
public class Guru {
    String namaGuru, keahlian, alamat, status;
    long totalGaji;
    
    public Guru(){
        totalGaji = 2000000;
    }
    
    public Guru(String namaGuru, String keahlian, String alamat, 
            String status){
        this.namaGuru = namaGuru;
        this.keahlian = keahlian;
        this.alamat = alamat;
        this.status = status;
        this.totalGaji = 2000000;
    }
}
