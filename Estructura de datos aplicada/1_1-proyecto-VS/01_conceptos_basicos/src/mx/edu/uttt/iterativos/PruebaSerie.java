package mx.edu.uttt.iterativos;

import javax.swing.JOptionPane;

public class PruebaSerie {
    public static void main(String[]args){
        Serie serie1 = new Serie(5);
        JOptionPane.showMessageDialog(null, serie1.getN());
        JOptionPane.showMessageDialog(null, serie1);

    }

}
