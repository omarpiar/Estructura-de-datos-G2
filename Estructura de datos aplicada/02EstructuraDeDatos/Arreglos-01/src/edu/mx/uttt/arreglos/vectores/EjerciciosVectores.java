package edu.mx.uttt.arreglos.vectores;

public class EjerciciosVectores {
    private int [] vector;
    private int tamanio;
//es para validar el tamaño del arreglo cuando se crea
    public EjerciciosVectores(int tamanio){
        if(tamanio>0){
            this.tamanio = tamanio;
        }else{
            this.tamanio = 1;
        }

        this.vector = new int[this.tamanio];
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        if(tamanio>0){
            this.tamanio = tamanio;
        }
        
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        if(vector.length == this.tamanio){
            for (int i=0; i<vector.length; i++){
                this.vector[i] = vector[i];
            }
        }
    }
    
    public int [] invertirVector(){
        int j = 0;
        int[] vectorInverso = new int[tamanio];
        for (int i = this.tamanio-1; i>=0; i--){
            vectorInverso[j] = this.vector[i];
            j++;
        }
        return vectorInverso;
    }

    public int maximo(int [] vector){
        int max=0;
        for (int i=0; i<vector.length; i++){
            if(max<this.vector[i]){
                max=this.vector[i];
            }
        }
        return max;
    }

    public int minimo(int[] vector){
        int min = vector[0];
        for(int i=0; i<vector.length; i++){
            if(min>vector[i]){
                min=vector[i];
            }
        }
        return min;
    }
}
