package mx.edu.uttt.iterativos;

public class Serie {
    private int n;

    public Serie(){
        this.n = 1;
    }

    public Serie(int n){
        this.n = (n>0)?n:1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if(n>0){
            this.n = n;
        }else{
            System.out.println("El valor de ( "+ this.n +" ) no puede se negativo");
            this.n = 1;
        }
    }

    public double calcularSerie (int n){
        int i=1;
        double r=0;

        while(i<this.n){
            r+=1.0/i;
        }
        return r;
    }

    @Override
    public String toString() {
        return "El resultado de la serie hasta "+ this.n +" es: "+ this.calcularSerie(n);
    }

    

}
