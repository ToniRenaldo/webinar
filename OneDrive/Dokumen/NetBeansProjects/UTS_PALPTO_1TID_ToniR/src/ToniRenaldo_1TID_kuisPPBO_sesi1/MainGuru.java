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
public class MainGuru {
    public static void main(String[] args) {
        GuruTetap guru1 = new GuruTetap("Endang, S.Pd.","Biologi"
                ,"Jl. Umban Sari", "Guru Tetap");
        GuruKontrak guru2 = new GuruKontrak("Ceria, S.Pdi.","Agama Islam"
                ,"Jl. Kembang Sari","Guru Kontrak",5);
        
        System.out.println("Nama Guru: " + guru1.namaGuru);
        System.out.println("Keahlian: " + guru1.keahlian);
        System.out.println("Alamat: " + guru1.alamat);
        System.out.println("Status: " + guru1.status);
        System.out.println("Total Gaji: " + guru1.getTotalGaji());
        
        System.out.println("");
        
        System.out.println("Nama Guru: " + guru2.namaGuru);
        System.out.println("Keahlian: " + guru2.keahlian);
        System.out.println("Alamat: " + guru2.alamat);
        System.out.println("Status: " + guru2.status);
        System.out.println("Jumlah mengajar tambahan: " + guru2.getJumlahMengajar());
        System.out.println("Total Gaji: " + guru2.getTotalGaji());
    }
}
