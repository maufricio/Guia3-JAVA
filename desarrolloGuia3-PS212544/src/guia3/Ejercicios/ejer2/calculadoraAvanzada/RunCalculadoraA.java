package guia3.Ejercicios.ejer2.calculadoraAvanzada;
import javax.swing.JOptionPane;

public class RunCalculadoraA {
    public static void main(String[] args) {
        String numero1, numero2;
        CalculadoraAvanzada calculadoraA = new CalculadoraAvanzada();

        numero1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero: ");
        numero2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero: ");

        System.out.println("Potenciación de numeros  " + numero1 +" ^ " + numero2 + " :" + calculadoraA.potenciaNumeros(Double.parseDouble(numero1), Double.parseDouble(numero2)));
        System.out.println("Factorial de numeros  " + numero1 +" y " + numero2 + " :" + calculadoraA.factorialNumeros(Double.parseDouble(numero1), Double.parseDouble(numero2)));
        System.out.println( calculadoraA.opuestosNumeros(Double.parseDouble(numero1), Double.parseDouble(numero2)));

    }
}
