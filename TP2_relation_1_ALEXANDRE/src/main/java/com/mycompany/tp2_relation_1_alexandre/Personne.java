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

    }
    
    
        @Override
    public String toString(){ 
        return Prenom + " " + Nom;

    
    }  
}
