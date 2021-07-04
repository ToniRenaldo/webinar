/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author ASUS
 */
public class EmailNotification implements Notifikasi {
    @Override
    public void sendMessage(String receiver, String content){
        System.out.println("Mengirim email ke: "+receiver + 
                "dengan isi pesan: "+ content);
    }
}
