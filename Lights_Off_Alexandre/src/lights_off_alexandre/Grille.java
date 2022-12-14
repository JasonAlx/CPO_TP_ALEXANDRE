/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_off_alexandre;

/**
 *
 * @author jason
 */
public class Grille {
    int Ligne=5;
    int Colonne=5;
    Cellule [][] cellules = new Cellule [Ligne][Colonne];
//création de la grille de 5*5
    
    public Grille(){
        for (int i=0;i<Ligne;i++){
            for (int j=0;j<Colonne;j++){
                cellules[i][j]=new Cellule();
            }
        }
    }
    public void changevoisin (int i,int j){
        if (cellules[i][j].changeetat()==true){
            if (i>0){
                cellules[i-1][j].changeetat();
            }if (i<4){
                cellules[i+1][j].changeetat();
            }if (j>0){
                cellules[i][j-1].changeetat();
            }if (j<4);
                cellules[i][j+1].changeetat();
        }
    }
}


