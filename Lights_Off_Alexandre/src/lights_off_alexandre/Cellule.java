/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_off_alexandre;

/**
 *
 * @author jason
 */
public class Cellule {
   boolean etreallume=false;
    //initalisation de la cellule en éteint
    
    /**
     *permet de conaitre l'etat d'une cellule
     * @return
     */
    public boolean celluleallume() {
        if (etreallume==true){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     *change l'etat de la cellule
     */
    public boolean changeetat(){
        if (etreallume==true){
            etreallume=false;
        }else{
            etreallume=true;
        }
    return true;  
    }
    
    
    
}
 
