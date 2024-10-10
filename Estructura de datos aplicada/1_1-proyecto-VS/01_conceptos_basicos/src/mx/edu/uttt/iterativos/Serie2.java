package mx.edu.uttt.iterativos;


public class Serie2 {
    private int n;
    private Factorial factorial;

    public Serie2(){
        this.n=1;
        factorial=new Factorial();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Factorial getFactorial() {
        return factorial;
    }

    public void setFactorial(Factorial factorial) {
        this.factorial = factorial;
    }

    public double calcular(){
        double r=0.0;
        for (int i=0; i<=this.n; i++){
            r+=i/factorial.calcular();
        }
        return r;
    }

    
}
