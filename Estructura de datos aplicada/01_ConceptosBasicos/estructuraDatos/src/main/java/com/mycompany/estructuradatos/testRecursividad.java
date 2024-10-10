/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradatos;

import javax.swing.JOptionPane;

/**
 *
 * @author picaz
 */
public class testRecursividad {
    public static void main(String[] args) {
        ejecutar();
    
    public static String menu(){
        String menu= "Menu principal\n"+
        "1) Metodo iterativo\n"+
        "2) Metodo Recursivo\n";

        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar(){
        boolean sentinel = true;
        String opcion = "";
        do{
         opcion = menu();

        switch (opcion){
            case "1":
            System.out.println("Opcion 1");
            break;
            case "2":
            break;
            case "3":
            sentinel = false;
            break;

            default:
            JOptionPane.showMessageDialog(null, "Valor no valido");
        }
    }while(sentinel);
        
    }
}

