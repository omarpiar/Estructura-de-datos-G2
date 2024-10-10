
package edu.mx.uttt.iterativos.evaluacion;

import javax.swing.JOptionPane;

public class prueba {

    public static void main(String[] args) {
        ejercicio1 ob1 = new ejercicio1();
        ob1.setN(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posición de la suma de fracciones: ")));
        JOptionPane.showMessageDialog(null,"El resultado es: "+ob1.s(ob1.getN()));
        
    }
    
}
