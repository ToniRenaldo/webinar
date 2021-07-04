/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_5;

/**
 *
 * @author LEGION
 */
public class Mobil {
    private String merek,noPlat;
    private long tahunkeluaran;

    public Mobil(String merek, String noPlat, long tahunkeluaran) {
        this.merek = merek;
        this.noPlat = noPlat;
        this.tahunkeluaran = tahunkeluaran;
    }

    public String getMerek() {
        return merek;
    }
    
    public void setMerek(String merek) {
        this.merek = merek;
    }
    
    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public long getTahunkeluaran() {
        return tahunkeluaran;
    }
    
    public void setTahunkeluaran(long tahunkeluaran) {
        this.tahunkeluaran = tahunkeluaran;
    }
}
