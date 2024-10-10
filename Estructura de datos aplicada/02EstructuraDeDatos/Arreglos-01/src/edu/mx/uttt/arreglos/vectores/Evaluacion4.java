import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Evaluacion4 {
    
    private int[] numeros;

    public Evaluacion4() {
        numeros = new int[30];
        generarNumeros();
    }

    private void generarNumeros() {
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(30) + 1; // Generar números entre 1 y 30
        }
        System.out.println("Números generados: " + Arrays.toString(numeros));
    }

    public void realizarOperaciones() {
        obtenerMaximo();
        obtenerMinimo();
        calcularMedia();
        calcularModa();
        calcularMediana();
        calcularPorcentajes();
    }

    private void obtenerMaximo() {
        int max = Arrays.stream(numeros).max().getAsInt();
        System.out.println("Número máximo: " + max);
    }

    private void obtenerMinimo() {
        int min = Arrays.stream(numeros).min().getAsInt();
        System.out.println("Número mínimo: " + min);
    }

    private void calcularMedia() {
        double media = Arrays.stream(numeros).average().orElse(0.0);
        System.out.println("Media: " + media);
    }

    private void calcularModa() {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int numero : numeros) {
            frecuencia.put(numero, frecuencia.getOrDefault(numero, 0) + 1);
        }

        int moda = numeros[0];
        int maxFrecuencia = 0;

        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                moda = entry.getKey();
            }
        }

        System.out.println("Moda: " + moda + " (frecuencia: " + maxFrecuencia + ")");
    }

    private void calcularMediana() {
        Arrays.sort(numeros);
        double mediana;
        if (numeros.length % 2 == 0) {
            mediana = (numeros[numeros.length / 2 - 1] + numeros[numeros.length / 2]) / 2.0;
        } else {
            mediana = numeros[numeros.length / 2];
        }
        System.out.println("Mediana: " + mediana);
    }

    private void calcularPorcentajes() {
        Map<Integer, Integer> conteo = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            conteo.put(i, 0); // Inicializar el conteo de 1 a 10
        }

        for (int numero : numeros) {
            if (numero >= 1 && numero <= 10) {
                conteo.put(numero, conteo.get(numero) + 1);
            }
        }

        System.out.println("Frecuencia y porcentajes de los números del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            int count = conteo.get(i);
            double porcentaje = (count / 30.0) * 100;
            System.out.println("Número " + i + ": " + count + " veces (" + porcentaje + "%)");
        }
    }


}
