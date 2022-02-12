package guia3.Ejemplos;

import javax.swing.*;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private String edad;

    //Constructor por sin parametros
    //Se utiliza al instanciar el objeto

    public Persona() {
        nombre = "Mauricio";
        apellido = "Perez";
        edad = "18";
    }

    //Constructor con parametros
    public Persona(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Permite definir datos a los atributos

    public void ingresoDatos() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese el Apellido: ");
        edad = JOptionPane.showInputDialog("Ingrese su edad: ");
    }

    //Permite imprimir los valores de los atributos

    public void mostrarDatos() {
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su Apellido es: " + apellido);
        System.out.println("Su edad es: " + edad);
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();//instancia del objeto1
        Persona persona2 = new Persona("Manuel", "Valdez", "25");
        //Llamamos al método mostrar datos de persona1
        persona1.mostrarDatos();
        System.out.println("**************************");
        //Cambiamos valor a los atributos de persona1
        persona1.ingresoDatos();
        //Llamamos al metodo mostrar datos para el objeto persona1
        persona1.mostrarDatos();
        System.out.println("***************************");
        //Llamamos al metodo mostrarDatos de persona2
        persona2.mostrarDatos();
        System.out.println("***************************");
        persona1.apellido = "Sanchez";
        persona1.mostrarDatos();
        System.out.println("***************************");
    }


}
