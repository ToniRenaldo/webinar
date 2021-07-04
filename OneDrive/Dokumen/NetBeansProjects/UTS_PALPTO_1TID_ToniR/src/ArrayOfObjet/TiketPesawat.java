package ArrayOfObjet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author LAB313-PC27
 */
public class TiketPesawat {
    Scanner sc = new Scanner(System.in);
    
    public int id, kursi;
    public double harga, jadwal;
    public String nama_pnmp, maskapai, konfirmasi;
    
    TiketPesawat(){
        this.id=0;
        this.kursi=0;
        this.harga=0;
        this.jadwal=0;
        this.nama_pnmp="";
        this.maskapai="";
        this.konfirmasi=maskapai;
    }
    public void getData(){
        System.out.print("Masukkan ID penumpang: ");
        id=Integer.parseInt(sc.nextLine());
        
        System.out.print("Masukkan Nama: ");
        nama_pnmp=sc.nextLine();
        
        System.out.print("Maskapai yang dipilih: ");
        maskapai=sc.nextLine();
        
        System.out.print("Nomor Kursi: ");
        kursi=Integer.parseInt(sc.nextLine());
        
        System.out.print("Harga Tiket: ");
        harga=Double.parseDouble(sc.nextLine());
        
        System.out.print("Inputkan Waktu Keberangkatan: ");
        jadwal=Double.parseDouble(sc.nextLine());
        
        System.out.println("Konfirmasi Penerbangan ");
        konfirmasi="";
    }
    public void setData(){
        if(maskapai.equalsIgnoreCase("Lion Air") || maskapai.equalsIgnoreCase("Citilink")){
            konfirmasi = "Delay";
        }
        else{
            konfirmasi = "Keberangkatan sesuai jadwal";
        }
        System.out.println(id+"\t"+nama_pnmp+"\t"+maskapai+"\t"+kursi+"\t"+harga+"\t"+jadwal+"\t"+konfirmasi);
    }
}
