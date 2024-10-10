/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.iterativos;

import javax.swing.JOptionPane;

/**
 *
 * @author picaz
 */
public class PruebaSerie {
    public static void main (String[]args){
        
        serie serie1 = new serie();
        serie1.setN(5);
        JOptionPane.showMessageDialog(null, serie1.calcular());
        JOptionPane.showMessageDialog(null, serie1);
    }
}
