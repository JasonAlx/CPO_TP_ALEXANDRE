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
   boolean etreallume;//variable de la cellule si elle est eteinte ou allumé
   boolean cellulejoue;//variable de la cellule si elle vient juste d'etre jouee ou non


    
    public Cellule(boolean Etreallume,boolean Cellulejoue){
        etreallume=Etreallume;
        cellulejoue=Cellulejoue;
    }//on met ces variables en attribut

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
     *allume la cellule
     */
    public void setallumee(){
        etreallume=true;
    }

    /**
     *eteint la cellule
     */
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

    /**
     *regarde si la cellule vient d'etre jouée
     * @return
     */
    public boolean etrecellulejoue (){
        if (cellulejoue==true){
            return true;
        }return false;
    }

    /**fait que la cellule vient d'etre joué
     *
     */
    public void setcellulejoue(){
       cellulejoue=true;
   }

    /**
     *fait que la cellule ne vient pas d'etre jouée
     */
    public void setnoncellulejoue(){
       cellulejoue=false;
   }
    
    
}
 

