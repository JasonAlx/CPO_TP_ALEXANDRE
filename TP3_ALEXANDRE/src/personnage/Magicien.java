/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnage;

/**
 *
 * @author jason
 */
public class Magicien extends personnage{
    boolean confirmé;
    
    public Magicien (String N, int v, boolean c){
        super(N,v);
        confirmé=c;
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }
    
    public boolean getconfrmé(){
        return confirmé;   
    }
    @Override
    public String toString(){
        return "Magicien{nom = "+ nom +", niveau de vie = "+vie +", confirmé="+confirmé+"}";
    }
}
