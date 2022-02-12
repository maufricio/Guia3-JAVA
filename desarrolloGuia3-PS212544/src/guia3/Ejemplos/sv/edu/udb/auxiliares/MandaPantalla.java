package guia3.Ejemplos.sv.edu.udb.auxiliares; //Paquete en el que se encuentra la clase MandaPantalla
import guia3.Ejemplos.sv.edu.udb.escritura.*;//Importamos la clase Pantalla

public class MandaPantalla {
    public static void main(String[] args) {
        Pantalla primera = new Pantalla();
        primera.conSalto("Esto es un renglon CON salto de linea");
        primera.conSalto("esta linea también tiene salto");
        primera.sinSalto("Linea Continua");
        primera.sinSalto("Linea Continua");
        primera.conSalto("Esta linea si tiene salto!");
        primera.sinSalto("Termina sin salto");
        System.out.println("Se termina el uso de funciones");
    }

}
