/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_alexandre;

import armes.*;

/**
 *
 * @author jason
 */
public class TP3_ALEXANDRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        epee epee1=new epee("Excalibure",7, 5);
        epee epee2=new epee( "Durandal",4,7);
        baton baton1=new baton("Chêne", 4,5);
        baton baton2=new baton("Charme", 5,6);
        
        System.out.println(epee1);
        System.out.println(epee2);
        System.out.println(baton1);
        System.out.println(baton2);
    }
    
}
