package guia3.Ejemplos;

import javax.swing.JOptionPane;
public class PruebaTiempo1 {

    public static void main(String[] args) {
        Tiempo1 tiempo1 = new Tiempo1();
        String salida = "La hora inicial universal es: " + tiempo1.aStringUniversal() + "\n y la hora estandar universal es: "+ tiempo1.aStringEstandar() + "\n";

        //cambiar tiempo y hora actualizada a salida

        tiempo1.establecerHora(13, 27, 6);
        salida += "\n\n La hora universal despues de establecerHora es: " + tiempo1.aStringUniversal() + "\n La hora estándar es: " + tiempo1.aStringEstandar();

        //establecer tiempo con valores inválidos; anexar hora actualizada a salida
        tiempo1.establecerHora(99,99,99);
        salida += "\n\n Después de intentar ajustes inválidos: \n Hora Universal: " + tiempo1.aStringUniversal() +
        "\n Hora estándar: " + tiempo1.aStringEstandar();
        JOptionPane.showMessageDialog(null, salida, "Prueba de la clase Tiempo1", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
