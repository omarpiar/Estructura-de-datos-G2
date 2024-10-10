package mx.edu.uttt.iterativos;
import javax.swing.JOptionPane;
public class PruebaSerieFactorial {
    public static void main(String[] args) {
        SerieFactorial sf1 = new SerieFactorial();
        sf1.setN(2);
        JOptionPane.showMessageDialog(null, sf1.calcular());
    }
}
