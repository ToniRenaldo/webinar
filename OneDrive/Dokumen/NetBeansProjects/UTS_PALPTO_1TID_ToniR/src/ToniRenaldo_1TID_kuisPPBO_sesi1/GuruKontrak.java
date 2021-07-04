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
public class GuruKontrak extends Guru {
    private long gajiMengajar, jumlahMengajar;
    
    public GuruKontrak(String namaGuru, String keahlian, String alamat, 
            String status, long jumlahMengajar){
        super.namaGuru = namaGuru;
        super.keahlian = keahlian;
        super.alamat = alamat;
        super.status = status;
        this.jumlahMengajar = jumlahMengajar;
    }

    public long getJumlahMengajar() {
        return jumlahMengajar;
    }
    
    public long getTotalGaji() {
        return super.totalGaji + (50000 * jumlahMengajar);
    }
}
