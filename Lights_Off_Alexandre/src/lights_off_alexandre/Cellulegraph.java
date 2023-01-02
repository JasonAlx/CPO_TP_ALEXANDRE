/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights_off_alexandre;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author jason
 */
public class Cellulegraph extends JButton {
    Cellule celluleassociee;
    //ImageIcon img_vide=new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
    
    public Cellulegraph (Cellule cellule){
        celluleassociee=cellule;   
    }
    /*@Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        setIcon(img_vide);
       
    }*/
    
}
