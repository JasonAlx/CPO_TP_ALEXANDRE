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
    Grille GrilleJeu = new Grille();
    
    public void initialiserpartie(Cellule cellules[][]){
        int Ligne = 4;
        int Colonne = 4;
        
      Random generateurAleat = new Random();
      int x, y;
      for (int i=0;i<4;i++){
          x = generateurAleat.nextInt(Ligne);
          y = generateurAleat.nextInt(Colonne);
          cellules[x][y].changeetat();
      }
    }
    /*public void debuterpartie(Partie partie){
        partie.initialiserpartie();
    }*/
    public int clickcoord (String qst){
        Scanner sc = new Scanner(System.in);
        System.out.println(qst);
        int rep = sc.nextInt();
        return rep;
    }
    public void finpartie(Joueur coup){
        if (GrilleJeu.partiegagnee()==true){
            System.out.println("Partie gagné en " +coup+" coups.");
        }
    }
}
