public class fibonaci {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if(n>=0){
            this.n=n;
        }
    }

    public static int calFib(int n){
        //return (n<=1)?n:calFib(n-1)+calFib(n-2);

        if(n<=1){
            //Caso base
            return n;
        }else{
            //Caso general
            return calFib(n-1)+calFib(n-2);
        }
    }
    
}
