package mx.edu.uttt.iterativos;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        double resultado = gestionarOperaciones(menu());

        if (resultado == 0.0){

        }
    }

    public static String menu(){
        String menu = "MENU PRINCIPAL" +
                       "\n1.-Serie 1: "+
                       "\n1.-Serie 2: "+
                       "\n1.-Factorial: "+
                       "\n1.-Potencia: "+
                       "\n1.-Serie 3: "+
                       "\nElige una opcion ";
        return JOptionPane.showInputDialog(menu);
    }

    public static double gestionarOperaciones(String opcion){
        double resultado = 0.0;
        int valor = 0;

        switch(opcion){
            case "1":
            Serie serie = new Serie();
            valor = Integer.parseInt(opcion)
            resultado = JOptionPane.showInputDialog("Ingresa el valor de n: ");
            break;
            case "2":
            break;
            case "3":
            break;
            case "4":
            break;
            case "5":
            break;

            default:
            System.out.println("No existe el valor");
        }

        return resultado;
    }
}
