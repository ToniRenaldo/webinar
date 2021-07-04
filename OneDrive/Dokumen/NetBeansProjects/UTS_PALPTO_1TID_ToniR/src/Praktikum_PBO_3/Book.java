/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;


/**
 *
 * @author ASUS
 */
public class Book {
    private String title;
    private String author;
    
    public Book(){
        title = "";
        author = "";
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title= title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author= author;
    }
    public void tampil_info(){
        System.out.println("Judul Buku: "+getTitle());
        System.out.println("Penulis Buku: "+ getAuthor());
    }
}
