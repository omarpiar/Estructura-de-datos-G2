import java.util.Arrays;
import java.util.Random;

public class Evaluacion4Segunda {
    
    private int[] puntajes;

    public Evaluacion4Segunda(int n) {
        puntajes = new int[n];
        generarPuntajes();
    }

    private void generarPuntajes() {
        Random random = new Random();
        for (int i = 0; i < puntajes.length; i++) {
            puntajes[i] = random.nextInt(21); // Generar puntajes entre 0 y 20
        }
        System.out.println("Puntajes generados: " + Arrays.toString(puntajes));
    }

    public void clasificarPuntajes() {
        int deficientes = 0, regulares = 0, buenos = 0, excelentes = 0;

        for (int puntaje : puntajes) {
            if (puntaje >= 0 && puntaje <= 5) {
                deficientes++;
            } else if (puntaje >= 6 && puntaje <= 10) {
                regulares++;
            } else if (puntaje >= 11 && puntaje <= 15) {
                buenos++;
            } else if (puntaje >= 16 && puntaje <= 20) {
                excelentes++;
            }
        }

        System.out.println("Clasificación de estudiantes:");
        System.out.println("Deficientes (0-5): " + deficientes);
        System.out.println("Regulares (6-10): " + regulares);
        System.out.println("Buenos (11-15): " + buenos);
        System.out.println("Excelentes (16-20): " + excelentes);
    }


}
