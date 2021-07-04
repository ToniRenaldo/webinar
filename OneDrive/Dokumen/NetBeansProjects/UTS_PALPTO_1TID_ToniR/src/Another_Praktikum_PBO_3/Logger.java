/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Another_Praktikum_PBO_3;

import Praktikum_PBO_3.*;

/**
 *
 * @author ASUS
 */
public class Logger {
    public int debugLevel;
    
    public Logger(){
        debugLevel=10;
    }
    public void debug (String Logline){
        System.out.println("Debug: "+Logline);
    }
    public void info(String Logline){
        System.out.println("Info: "+Logline);
    }
}
