/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;



/**
 *
 * @author USER
 */
public class DemoNotification {
    public static void main(String [] args){
        EmailNotification email = new EmailNotification();
        SMSNotification sms = new SMSNotification();
        
        email.sendMessage("19tiepbo@pcr.ac.id", "Sorry. there is"
                + "no give up word in my dictionary");
        sms.sendMessage("+6200008888", "PBO is easy peasy");
    }
}
