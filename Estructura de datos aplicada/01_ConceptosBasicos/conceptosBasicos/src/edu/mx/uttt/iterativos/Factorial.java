/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.uttt.iterativos;
/*PROGRAMA PARA CALCULAR UN MUMERO ENTERO
1.REALIZAR LA VALIDACION PARA QUE LA VARIABLE DE INSTANCIA NUNCA SEA 0
2.REALIZAR UN METODO QUE CALCULE EL FACTORIAL UTILIZANDO EL CICLO FOR
3.Realizar un metodo que calcule el factorial, de forma inversa utilizando un while

EJEMPLO: Factorial
f(1) = 1
f(2) = 2*1
f(3) = 3*2*1
f(n) = 1*2*...n
*/
/**
 *
 * @author picaz
 */
public class Factorial {
    private int n;
    
    public Factorial(){
        this.n=1;
    }
    
    public Factorial(int n){
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
    
   public int calcular(){
       int r=1;
       for (int i=1; i<=n; i++){
           r*=i;
       }
       return r;
   }
   
   public int calcularReverse(){
       int r=1;
       int i=n;
       while (i>=1){
           r*=i;
           i--;
       }
       return r;
   }
   
    @Override
   public String toString(){
       return "El factorial de "+ this.n + "es: "+ this.calcular();
   }
}
