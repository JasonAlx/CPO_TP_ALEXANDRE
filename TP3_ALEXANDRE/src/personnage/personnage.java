/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnage;

import armes.Arme;

/**
 *
 * @author jason
 */
public class personnage {
    String nom;
    protected int vie;
    
    public personnage (String N, int v){
        nom=N;
        vie=v;
    }
    public int getvie(){
        return vie;
       
    }
    @Override
        public String toString(){
            return "personnage{nom = "+ nom +", niveau de vie = "+vie+"}";
    } 
        
    public void Ajout_arme(Arme arme){
        if (tablo.size()<5){
            tablo.add(arme);   
        }
    public void Methode_arme(Arme arme){
        int verif =0;
        for (int i=0;i<tablo.size();i++){
            if (tablo.get(i)==arme){
                System.out.println("Larme a bien ete trouvee et est affactee");
                arme_en_main=tablo.get(i);
                verif=1;
                break;
            }
        }
            if (verif==0){
                Systeme.out.println("L'arme n'a pas ete trouvee");
            }
        
    }//faut que je finnisse de recopier
}
}