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

    Cellule [][] cellules = new Cellule [5][5];
//création de la grille de 5*5
    
    /**
     *on met 25 cellules non jouées et eteintes dans la grille
     */
    public Grille(){
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                cellules[i][j]=new Cellule(false,false);
            }
        }
    }

    /**
     *permet de changer l'etat des cellules voisines de celle jouée en faisant attention à ne pas sortir de la grille 
     * @param i
     * @param j
     */
    public void changevoisinne (int i,int j){
            if (i>0){          
                    cellules[i-1][j].changeetat();
            }if (i<4){
                    cellules[i+1][j].changeetat();
            }if (j>0){
                    cellules[i][j-1].changeetat();
            }if (j<4){
                    cellules[i][j+1].changeetat();

            }
            
    }

    /**
     *retrouve quelle cellule à été changé et invoque la methode changevoisinne avec les bonnes coordonnées
     */
    public void changevoisin (){
        for (int a = 4; a >= 0; a--) {
            for (int b = 0; b < 5; b++) {
                if (cellules[a][b].etrecellulejoue()==true){
                    changevoisinne (a,b);
                    cellules[a][b].setnoncellulejoue();
                }
            }
        }
    }

    /**
     *determine si la partie est gagnée en verifiannt que 25 cases sont eteintes
     * @return
     */
    public boolean partiegagnee(){
        int compteur=0;
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
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

    /**
     *permet de rendre aleatoirement certaines cellules allumees
     */
    public void random(){
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (Math.random()>0.8){
                    cellules[i][j].setallumee();
                }else{
                    cellules[i][j].seteteint();
                }
            }
        }
    }
}    


