/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp2_manip_alexandre;

/**
 *
 * @author jason
 */
public class TP2_manip_ALEXANDRE {

    public static void main(String[] args) {

        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        // il y a 3 tartiflettes différentes mais la 3e a les memes caractéristiques que la 2e

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        Tartiflette assiette0 = assiette1;
        assiette1 = assiette2;
        assiette2 = assiette0;

        //Moussaka assiette666 = assiette1 ;
        //Cette ligne n'est pas fausse elle creer simplement une assiette de moussaka avec autant de calories que l'assiette1
        //Moussaka assiette667 = new Tartiflette() ;
        //Faux cette ligne utilise 2 classes différentes et ces 2 classes n'ont aucun rappot
        
        Moussaka[] tabmous = new Moussaka[10];
        for (int k = 0; k < tabmous.length; k++) {
            tabmous[k] = new Moussaka(1);
            //on met 10 instances de la classe Moussaka dans un tableau de type moussaka 

        }

    }
}
