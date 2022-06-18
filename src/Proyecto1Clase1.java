
import javax.swing.*;

public class Proyecto1Clase1 {
    public static void main(String[] args) {

        double a,b;
        a= Integer.parseInt(JOptionPane.showInputDialog("ingrese valor de a"));
        b= Integer.parseInt(JOptionPane.showInputDialog("ingrese valor de b"));
        JOptionPane.showMessageDialog(null, "el valor de la suma es de "+suma(a,b));
    }

    public static double suma (double a, double b){
        double suma = a+b;
        return suma;
    }
}

