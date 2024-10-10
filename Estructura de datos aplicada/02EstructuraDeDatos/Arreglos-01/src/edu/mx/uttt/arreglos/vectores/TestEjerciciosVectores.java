package edu.mx.uttt.arreglos.vectores;

public class TestEjerciciosVectores {
public static void main(String[] args) {
    //crea un objeto de la clase EjerciciosVectores
    EjerciciosVectores e = new EjerciciosVectores(3);

    int[] vector = {3,5,10};
    e.setVector(vector);

    String resultado = "";
    resultado = "Vector original: "+ vectorFormating(e.getVector())+
                 "\nVector inverso: "+ vectorFormating(e.invertirVector());
    System.out.println(resultado);

    System.out.println("El numero maximo del vector es: "+e.maximo(e.getVector())+
                        "\nEl numero mínimo del vector es: "+e.minimo(e.getVector()));
}
public static String vectorFormating(int [] vector){
    String formato = "[";
    for(int i=0; i<vector.length; i++){
        if(i==vector.length-1){
            formato += vector[i];
        }else{
            formato += vector[i]+ ",";
        }
    }
    formato+="]";
    return formato;
}
}


// String resultado = "Vector original: ";
//     int vectorOriginal[] = e.getVector();
//     int vectorInverso[] = e.invertirVector();

// for( int i=0; i<vectorOriginal.length; i++){
//     resultado += vectorOriginal[i]+ "->";
// }

// resultado+="\nVector Inverso: ";
// for( int i=0; i<vectorInverso.length; i++){
//     resultado += vectorInverso[i]+ "->";
// }

// System.out.println(resultado);
