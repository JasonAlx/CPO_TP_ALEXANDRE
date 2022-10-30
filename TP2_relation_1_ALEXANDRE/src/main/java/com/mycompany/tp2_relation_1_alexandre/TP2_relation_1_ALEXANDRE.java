/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp2_relation_1_alexandre;

/**
 *
 * @author jason
 */
public class TP2_relation_1_ALEXANDRE {

    public static void main(String[] args) {

        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles " + uneClio
                + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);
        
        //on crée différentes voitures et personnes et on affiche les voitures disponibles
        
        
        bob.liste_voitures[0] = uneClio;
        bob.nbVoitures = 1;
        uneClio.proprietaire = bob ;
        bob.liste_voitures[1] = uneAutreClio;
        bob.nbVoitures = 2;
        uneAutreClio.proprietaire = bob ;
        reno.liste_voitures[2] = une2008;
        reno.nbVoitures = 1;
        une2008.proprietaire = reno ;
        System.out.println("la premiere voiture de Bob est " +bob.liste_voitures[0]+" et la 2e vature est " +bob.liste_voitures[1] ) ;
        System.out.println("la 1e voiture de reno est " +reno.liste_voitures[2]) ;
    
    // on assigne des voitures à des personnes grace à un tableau et on l'affiche ainsi que toutes les caractérisques de la voiture et du propriétaire 
    
    
    }
}
