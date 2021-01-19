/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Buscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego juego=new Juego();
        
       
     //JOptionPane.showMessageDialog(null, juego.getMatriz2()[1][0]);
        
         juego.Jugar();
        
    }
    
}
