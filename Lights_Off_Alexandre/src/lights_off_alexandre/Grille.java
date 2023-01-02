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
    
    /**
     *on met les cellules dans la grille
     */
    public Grille(){
        for (int i=0;i<Ligne;i++){
            for (int j=0;j<Colonne;j++){
                cellules[i][j]=new Cellule();
            }
        }
    }

    /**
     *permet de changer l'etat des cellules voisines en faisant attention à ne pas sortir de la grille 
     * @param i
     * @param j
     */
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

    /**
     *determine si la partie est gagnée en verifiannt que 25 cases sont eteintes
     * @return
     */
    public boolean partiegagnee(){
        int compteur=0;
        for (int i=0;i<Ligne;i++){
            for (int j=0;j<Colonne;j++){
                if (cellules[i][j].celluleallume()==false){
                    compteur=compteur+1;
                    if (compteur==25){
                        return true;
                }else{
                    return false;
                    }
                }
            }
        }
        return false;
    }
}    


