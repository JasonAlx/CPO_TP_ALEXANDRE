/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_relation_1_alexandre;

/**
 *
 * @author jason
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    // on définit les différentes variables et on les associes à la classe voiture
    public Voiture (String modele ,String marque , int puissanceCV) {
        Modele=modele;
        Marque=marque;
        PuissanceCV=puissanceCV;
        proprietaire = null;

        
         
    }
    
    
        @Override
    public String toString(){       
        return "/Marque : " + Marque + " /Modele : " + Modele + " /Puissance : " + PuissanceCV + " /Proprietaire : " + " /Puissance : " + PuissanceCV + " /Proprietaire : " + proprietaire;

    }
}
