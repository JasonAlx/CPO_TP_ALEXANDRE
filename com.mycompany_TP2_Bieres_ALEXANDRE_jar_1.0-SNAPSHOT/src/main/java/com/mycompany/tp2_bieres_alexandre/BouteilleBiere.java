/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_bieres_alexandre;

/**
 *
 * @author jason
 */
public class BouteilleBiere {
//on definit les variables de l'étiquette

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    public void lireEtiquette() {
    // programme pour lire l'étiquette
        System.out.println("Bouteille de " + nom + " (" + degreAlcool
                + " degres) \nBrasserie : " + brasserie);
    }


    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        //on definit les caracaterisques de l'étiquette que l'on complétera pour chaque biere dans le main
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
    

    public boolean Décapsuler() {
        // programme pour décapsuler les bouteilles
        if (ouverte == false) {
            ouverte = true;
            return ouverte;
        } else if (ouverte == true) {
            System.out.println("Bière déjà ouverte");
            ouverte = false;
        }
        return ouverte;
    }
        @Override
        public String toString() {
            String chaine_a_retourner;
            chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
            if (ouverte == true ) chaine_a_retourner += "oui" ;
            else chaine_a_retourner += "non" ;
            return chaine_a_retourner ;
    }
}
