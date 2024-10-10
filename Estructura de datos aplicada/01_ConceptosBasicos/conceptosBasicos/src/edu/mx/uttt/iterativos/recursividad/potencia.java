/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.iterativos.recursividad;

/**
 *
 * @author picaz
 */
public class potencia {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n<=0)?n:0;
    } 
    
    public static int pot(int n){
        if(n==1){
            return n;
        }else{
            return pot(n-1)*2;
        }
    }
    
}
