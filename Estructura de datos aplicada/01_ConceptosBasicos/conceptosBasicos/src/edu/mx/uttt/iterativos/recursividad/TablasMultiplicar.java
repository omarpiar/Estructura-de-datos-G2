/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.iterativos.recursividad;

/**
 *
 * @author picaz
 */
public class TablasMultiplicar {
    private int n;
    private int x;
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void tabla(int n, int x){
        if(x>10){
            return;
        }
        System.out.println(n+" * "+x+" = "+n*x);
        tabla(n,x+1);
    }

    
}
