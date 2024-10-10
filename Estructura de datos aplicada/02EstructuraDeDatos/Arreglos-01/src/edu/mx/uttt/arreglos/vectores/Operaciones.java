package edu.mx.uttt.arreglos.vectores;

import javax.swing.JOptionPane;

public class Operaciones {
    public static void main(String[] args) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de calificaciones"));

        double calificaciones[] = new double [tam];
    }

    public static void agregarCalificaciones(arr []){
        int i = 0;
        while(i<arr.length){
            arr[i]+= Double.parseDouble(("Agrega la calificación numero " + (i+1)));
            i++;
        }
    }

    public static double calcularPromedios(arr []){
        double prom = 0.0;
        for(int i=0; i<arr.length; i++){
            prom += arr[i];
        }
        return prom/arr.length;
    }

}