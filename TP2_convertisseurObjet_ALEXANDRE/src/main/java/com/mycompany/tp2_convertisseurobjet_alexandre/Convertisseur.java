/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_convertisseurobjet_alexandre;
import java.util.Scanner;
/**
 *
 * @author jason
 */
public class Convertisseur {
    int nbConv;
    public Convertisseur(){
         nbConv = 0;
    }
    //initialisation du convertisseur 
     @Override
    public String toString(){
        return "nombre de conversions : "+ nbConv;
    }

    // on va ecrir tous les calculs pour chaque type de conversion
     public double CelciusVersKelvin(double celcius){
        double Kelvin = celcius + 273.15;
        return Kelvin;     
    }
   
    public double KelvinVersCelcius(double kelvin){
        double celcius = kelvin - 273.15;
        return celcius;    

    }

    public double FarenheitVersCelcius(double farenheit){
        double celcius = (farenheit - 32) / 1.8;
        return celcius;
    }

    public double CelciusVersFarenheit(double celcius){
        double farenheit = (celcius * 1.8) + 32;
        return farenheit; 

    }

    public double KelvinVersFarenheit(double kelvin){
        double farenheit = CelciusVersFarenheit(KelvinVersCelcius(kelvin));
        return farenheit; 
    }

   
    public double FarenheitVersKelvin(double farenheit){
        double kelvin = CelciusVersKelvin(FarenheitVersCelcius(farenheit));
        return kelvin;   
    }

   
// on crée un programme pour selection le type de conversion que l'on veut faire
    public byte selectmode(){
        byte mode = 0;
        Scanner sc;
        sc = new Scanner(System.in);

//on associe les tpes de conversions à des numéros et on le dit à l'utilisateur pour qu'il fasse son choix       

        System.out.println("Selectionnez la conversion de temperature souhaitee : \n"
                + "0 -> STOP\n"
                + "1 -> Celcius Vers Kelvin\n"
                + "2 -> Kelvin Vers Celcius\n"
                + "3 -> Farenheit Vers Celcius\n"
                + "4 -> Celcius Vers Farenheit\n"
                + "5 -> Kelvin Vers Farenheit\n"
                + "6 -> Farenheit Vers Kelvin\n");

       

        while(mode<1 | mode>6){
            mode = sc.nextByte();
        }
        return mode;
    }

    // on utilise dans le programme de convertion les programmes précédents
    //on demande de choisir un type de convertion ensuite de donner sa valeur à convertir et on affiche la valeurs et le mode choisit
    public double convert(){
        byte mode = selectmode();
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une valeur : ");
        double t = sc.nextDouble();
        System.out.println("Vous avez choisi : " + t + "\n");
        String entry = "";
        String output = "";
        double res = 0;

       
//on associe les numéros de convertions au programmes de calculs écrits pécédement
        switch(mode){
            case 0:
                return -300;
            case 1:
                entry = "Celsius";
                output = "Kelvin";
                res = CelciusVersKelvin(t);
                break;

            case 2:
                entry = "Kelvin";
                output = "Celsius";
                res = KelvinVersCelcius(t);
                break;
            case 3:
                entry = "Farenheit";
                output = "Celsius";
                res = FarenheitVersCelcius(t);
                break;

            case 4:
                entry = "Celsius";
                output = "Farenheit";
                res = CelciusVersFarenheit(t);
                break;
            case 5:
                entry = "Kelvin";
                output = "Farenheit";
                res = KelvinVersFarenheit(t);
                break;
            case 6:
                entry = "Farenheit";
                output = "Kelvin";
                res = FarenheitVersKelvin(t);
                break;
        }
        return res;
    }    
}
