/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armes;

import armes.Arme;

/**
 *
 * @author jason
 */

public class epee extends Arme {
    int finesse;
    
    public epee (String n, int i, int a){
        super(n,i);
        if (a>0){
            finesse=a;
        }else {
            finesse=0;
        }
    }
    @Override
    public String toString(){
        return "epee{" +"finesse="+finesse+"}";
    }
    public int getfinesse(){
        return finesse;
    }
    public void setfinesse(int age){
        this.finesse=finesse;
    }
}
    

