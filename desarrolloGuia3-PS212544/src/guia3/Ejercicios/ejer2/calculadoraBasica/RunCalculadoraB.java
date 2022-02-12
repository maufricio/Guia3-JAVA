package guia3.Ejercicios.ejer2.calculadoraBasica;
import javax.swing.JOptionPane;

public class RunCalculadoraB {
    public static void main(String[] args) {
        String numero1, numero2;
        double resultado = 0;
        CalculadoraBasica calculadora = new CalculadoraBasica();

        numero1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero.");
        numero2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero.");


        System.out.println("La suma de los numeros  " + numero1 + " y " + numero2+ " es: " + calculadora.sumaNumeros(Double.parseDouble(numero1), Double.parseDouble(numero2)));
        System.out.println("La resta de los numeros "+ numero1 + " y " + numero2+ " es: " + calculadora.restaNumeros(Double.parseDouble(numero1), Double.parseDouble(numero2)));
        System.out.println("La multiplicación de los numeros "+ numero1 + " y " + numero2+ " es: " +calculadora.multiplicacionNumeros(Double.parseDouble(numero1), Double.parseDouble(numero2)));
        System.out.println("La división de los numeros "+ numero1 + " y " + numero2+ " es: " +calculadora.divisionNumeros(Double.parseDouble(numero1), Double.parseDouble(numero2)));
    }
}
