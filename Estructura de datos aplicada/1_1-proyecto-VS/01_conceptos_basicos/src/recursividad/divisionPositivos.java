package recursividad;
public class divisionPositivos {
    int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }

    public double divisionFor(){

    }

    public double divisionWhile(){
        double i=0.0;
        while(i<1){
            i=n/3;
        }
        return i;
    }

    public double divisionDoWhile(){
        
    }
}
