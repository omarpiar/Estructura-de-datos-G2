/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.iterativos.recursividad;

/**
 *
 * @author picaz
 */
public class multiplicacionPorSuma {
    private int n;
    private int x;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = (x>0)?x:1;
    }
    
    public int m( int n, int x){
        if(n==1){
            return x;
        }else{
            return x + m(n-1,x);
        }
    }

}
