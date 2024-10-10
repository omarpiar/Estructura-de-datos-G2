package recursividad;

import javax.swing.JOptionPane;

public class testRecursividad {
    public static void main(String[] args) {
        ejecutar();
    }
    
    public static String menu(){
        String menu= "Menu principal\n"+
        "1) Metodo iterativo\n"+
        "2) Metodo Recursivo\n"+
        "3) Factorial\n" +
        "4) Salir";

        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar(){
        boolean sentinel = true;
        String opcion = "";
        operaciones op = new Operaciones();
        Factorial f = null;
        int n;
        long r =0;
        do{
         opcion = menu();

        switch (opcion){
            case "1":
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces a imprimir"));
            op.setN(n);
            op.imprimir();
            System.out.println("Opcion 1");
            break;
            case "2":
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces a imprimir"));
            op.setN(n);
            op.imprimir(op.getN());
            break;
            case "3":
            //Factorial
            opcion = menus.menuFactorial();
            f = new Factorial();
            n = Interger.parseInt(JOptionPane.showInputDialog("Introduce el valor del valor de la factorial a calcular"));
            r = f.factorialI(ocion);
            f.setN(n);
            JOptionPane.showMessageDialog(null, "f( "+f.getN() + ")"+"="+r);
            break;
            case "4":
            f = new Factorial();
            n = Interger.parseInt(JOptionPane.showInputDialog("Introduce el valor del valor de la factorial a calcular"));
            r = f.factorialI(ocion);
            JOptionPane.showMessageDialog(null, "f( "+f.getN() + ")"+"="+r);
            f.setN(n);
            r = f.factR(f.getN());
            JOptionPane.showMessageDialog(null, "f( "+f.getN() + ")"+"="+r);
            break;
            case "5":
            break;

            default:
            JOptionPane.showMessageDialog(null, "Valor no valido");
        }
    }while(sentinel);
        
    }
}

