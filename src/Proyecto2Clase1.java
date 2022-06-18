import javax.swing.*;

public class Proyecto2Clase1 {

    public static void main(String[] args) {

        double a,b;
        a= Integer.parseInt(JOptionPane.showInputDialog("ingrese valor de a"));
        b= Integer.parseInt(JOptionPane.showInputDialog("ingrese valor de b"));
        JOptionPane.showMessageDialog(null, "el valor de la suma es de "+resta(a,b));
    }

    public static double resta (double a, double b){
        double resta = a-b;
        return resta;
    }
}
