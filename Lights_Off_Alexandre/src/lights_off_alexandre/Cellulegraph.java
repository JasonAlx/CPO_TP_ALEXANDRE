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
    ImageIcon imgeteint=new javax.swing.ImageIcon(getClass().getResource("/image/celluleVide.png"));
    ImageIcon imgallume=new javax.swing.ImageIcon(getClass().getResource("/image/jetonJaune.png"));
    public Cellulegraph (Cellule cellule){
        celluleassociee=cellule;   
    }

    /**
     *associe les image des cases en fonction de leur etat
     * @param G
     */
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        if (celluleassociee.celluleallume()==false){
            setIcon(imgeteint);
        }else {
            setIcon(imgallume);
        }
       
    }
    
}
