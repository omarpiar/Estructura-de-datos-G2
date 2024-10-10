/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.iterativos;

public class serie {
   private int n;
   
   public serie(){
       this.n = 1;
   }
   
   public serie(int n){
       if(n<=0){
           this.n=1;
       }else{
           this.n=n;
       }
   }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if(n<=0){
           this.n=1;
       }else{
           this.n=n;
       }
    }
    
    public double calcular(){
        double r=0.0;
        for(int i=1; i<=n; i++){
            r+=1.0/i;
        }
        return r;
    }
    
   @Override
    public String toString(){
        return "El resultado de la serie es: " + this.calcular();
    }
   
   
}
