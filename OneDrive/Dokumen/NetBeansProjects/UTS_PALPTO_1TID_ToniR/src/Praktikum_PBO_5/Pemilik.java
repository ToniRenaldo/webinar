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
public class Pemilik {
    private String nama;
    private String alamat;
    private int jmlMobil,i;
    private String[] noPlatmobil = new String[5];
    Mobil mbl;

    public Pemilik(String nama, String alamat, int jmlMobil, Mobil mbl) {
        this.nama = nama;
        this.alamat = alamat;
        this.jmlMobil = jmlMobil;
        this.mbl = mbl;
    }

    public void jualMobil(String noPlat){
        i=0;
        if(noPlatmobil[i].equalsIgnoreCase(noPlat)){
            noPlatmobil[i]=null;
            jmlMobil--;
        }
        i++;
    }
    public void beliMobil(String noPlat){
        i=0;
        jmlMobil++;
        if(noPlatmobil[i] == null){
            noPlatmobil[i] = noPlat;
        }
        i++;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJmlMobil() {
        return jmlMobil;
    }

    public String getNoPlatmobil(int indeks) {
        return noPlatmobil[indeks];
    }

    public void setNoPlatmobil(String noPlatmobil) {
        if(i < noPlatmobil.length()){
            this.noPlatmobil[i] = noPlatmobil;
            i++;
        }
    }
    
    public static void main(String[] args) {
        Mobil m1 = new Mobil("Supra","BM 2351 DT", 2020);
        Pemilik p = new Pemilik("Reza","Jl.Pemuda",1,m1);
        
        p.setNoPlatmobil(m1.getNoPlat());
        
        System.out.println("Nama : "+p.getNama());
        System.out.println("Alamat : "+p.getAlamat());
        System.out.println("Jumlah Mobil : "+p.getJmlMobil());
        
        
        for (int i = 0; i < p.jmlMobil; i++) {
            System.out.println("No plat : "+p.getNoPlatmobil(i));
            System.out.println("Merk : "+p.mbl.getMerek());
            System.out.println("Tahun Keluaran : "+p.mbl.getTahunkeluaran());
            System.out.println("");
        }
        
        p.jualMobil("BM 2351 DT");
        m1.setMerek(null);
        m1.setTahunkeluaran(0000);
        System.out.println("");
        
        System.out.println("Data Setelah Penjualan :");
        System.out.println("Nama : "+p.getNama());
        System.out.println("Alamat : "+p.getAlamat());
        System.out.println("Jumlah Mobil : "+p.getJmlMobil());
        System.out.println("");
        for (int i = 0; i < p.jmlMobil; i++) {
            System.out.println("No plat : "+p.getNoPlatmobil(i));
            System.out.println("Merk : "+p.mbl.getMerek());
            System.out.println("Tahun Keluaran : "+p.mbl.getTahunkeluaran());
        }
        
        p.beliMobil("BM 5625 DE");
        System.out.println("");
        System.out.println("Data Setelah Pembelian : ");
        m1.setMerek("Limo");
        m1.setTahunkeluaran(2016);
        System.out.println("");
        System.out.println("Nama : "+p.getNama());
        System.out.println("Alamat : "+p.getAlamat());
        System.out.println("Jumlah Mobil : "+p.getJmlMobil());
        System.out.println("");
        for (int i = 0; i < p.jmlMobil; i++) {
            System.out.println("No plat : "+p.getNoPlatmobil(i));
            System.out.println("Merk : "+p.mbl.getMerek());
            System.out.println("Tahun Keluaran : "+p.mbl.getTahunkeluaran());
        }
    }
}