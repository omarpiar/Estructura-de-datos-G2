/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.iterativos.evaluacion;

/**
 *
 * @author picaz
 */
public class ejercicio1 {
    private double n;

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = (n>0)?n:1;
    }
    
    private double r(double n){
        if(n==1){
            return 1;
        }else{
            return r(n-1)*2;
        }
    }
    
    public double s(double n){
        if(n==1.0){
            return 1;
        }else{
            return s(n-1)+(1/r(n));
        }
    }
    
    }

