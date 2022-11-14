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
public class baton extends Arme {
    int age;
    
    public baton (String n, int i, int a){
        super(n,i);
        if (a>0){
            age=a;
        }else {
            age=0;
        }
    }
    @Override
    public String toString(){
        return "baton{" +"age="+age+"}";
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
