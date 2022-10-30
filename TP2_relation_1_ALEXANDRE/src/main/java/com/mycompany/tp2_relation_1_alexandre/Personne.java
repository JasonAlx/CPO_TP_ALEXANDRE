/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_alexandre;

/**
 *
 * @author jason
 */
public class Personne {
    String Nom;
    String Prenom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String nom,String prenom){
        //on donne les caractéristiques de la clesse personne
      Nom=nom;
      Prenom=prenom;
      liste_voitures = new Voiture[3];
      nbVoitures = 0;
      //on crée les différentes variables et on les associes à la classe personne, on cree aussi un tableau et on initialise chaque personne avec 0 voiture
    }
    
    
        @Override
    public String toString(){ 
        return Prenom + " " + Nom;

    
    }  
    
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {     
    //La methode ajouter voiture  prend en arguement un objet de la classe voiture
        if (nbVoitures < 3 & voiture_a_ajouter.proprietaire == null){       
        // si le personnage a moins de 3 voitures et que la voiture que l'on veut ajouter n'a pas de propriétaire
            for(int k = 0; k < 3; k ++){       
                //on vérifie si on peut ajouter une voiture 
                if(liste_voitures[k] == null){
                    liste_voitures[k] = voiture_a_ajouter;
                    nbVoitures ++;
                    voiture_a_ajouter.proprietaire = this;
                    return true;        
                    // si on a réussi à ajouter la voiture on retourne true sinon false
                }
            } 
        }
        return false;
    }

}
