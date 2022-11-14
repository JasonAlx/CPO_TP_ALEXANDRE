/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_alexandre;

/**
 *
 * @author jason
 */
public class Arme {
    String nom;
    int attaque;
    
    public Arme(String n,int i){
        nom=n;
        attaque = i;
    }    
    @Override
    public String toString(){
        return "Arme("+"nom="+nom+", attaque="+attaque+")" ;
    }
    
    
    
}
