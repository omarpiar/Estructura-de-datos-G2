package recursividad;

public class operaciones {
    private int n;

    public operaciones (){
        this.n = 1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
    }

    public void imprimir(){
        int i=1;
        
        while(i<=n){
            System.out.println("Hola mundo");
            i++;
        }
    }

    public void imprimir(int n){
        if(n==1){
            System.out.println("Hola mundo");
    }else{
        System.out.println("Hola mundo");
        imprimir(n-1);
    }
}
}
