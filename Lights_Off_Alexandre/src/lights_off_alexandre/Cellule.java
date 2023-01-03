/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_off_alexandre;
import java.util.Random;
/**
 *
 * @author jason
 */
public class Cellule {
   boolean etreallume;
   boolean cellulejoue=true;

    //initalisation de la cellule en éteint
    
    public Cellule(boolean Etreallume,boolean Cellulejoue){
        etreallume=Etreallume;
        cellulejoue=Cellulejoue;
    }

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
    public void setallumee(){
        etreallume=true;
    }
    public void seteteint(){
        etreallume=false;
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

    public boolean etrecellulejoue (){
        if (cellulejoue==true){
            return true;
        }return false;
    }
   public void setcellulejoue(){
       cellulejoue=true;
   }
   public void setnoncellulejoue(){
       cellulejoue=false;
   }
    
    
}
 

