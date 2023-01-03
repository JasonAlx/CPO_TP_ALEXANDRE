/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_off_alexandre;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jason
 */
public class Partie {
    
    Grille GrilleJeu; 
    /*public void initialiserpartie(){
        GrilleJeu= new Grille();
        GrilleJeu.random();
        
        
    }*/

    
    public int clickcoord (String qst){
        Scanner sc = new Scanner(System.in);
        System.out.println(qst);
        int rep = sc.nextInt();
        return rep;
    
    
    }
    /*public void reinitialiserpartie(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                
            }
        }
    }*/
}// classe non utilisé car le jeu est en mode graphique
