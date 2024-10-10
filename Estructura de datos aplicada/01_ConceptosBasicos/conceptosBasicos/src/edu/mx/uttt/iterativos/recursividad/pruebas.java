/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.mx.uttt.iterativos.recursividad;

/**
 *
 * @author picaz
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        multiplicacionPorSuma ob = new multiplicacionPorSuma();
        System.out.println("El resultado de la multiplicacion por suma es: "+ob.m(100, 50));
        
        TablasMultiplicar ob2 = new TablasMultiplicar();
        ob2.setX(1);
        ob2.tabla(3,ob2.getX());
    }
}
    
    

    
    

