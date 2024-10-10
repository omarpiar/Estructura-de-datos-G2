import java.util.Scanner;

public class TestEvaluacion4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opción:");
        System.out.println("1. Operaciones con 30 números aleatorios");
        System.out.println("2. Clasificación de puntajes");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            Evaluacion4 operaciones = new Evaluacion4();
            operaciones.realizarOperaciones();
        } else if (opcion == 2) {
            System.out.println("¿Cuántos puntajes quieres generar?");
            int n = scanner.nextInt();
            Evaluacion4Segunda clasificacion = new Evaluacion4Segunda(n);
            clasificacion.clasificarPuntajes();
        } else {
            System.out.println("Opción inválida.");
        }

        scanner.close();
    }


}
