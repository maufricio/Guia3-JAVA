package guia3.Ejemplos;
import javax.swing.JOptionPane;

public class Empleado {
    private String nombre, apellido;

    public void ingresarDatos(){
        this.nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado: ", "Ingresar Nombre", JOptionPane.INFORMATION_MESSAGE);
        this.apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del empleado", "Ingresar Apellido", JOptionPane.INFORMATION_MESSAGE);
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, this.nombre + " " + this.apellido, "Datos del empleado", JOptionPane.INFORMATION_MESSAGE);
    }
}

//Clase profesor hereda de empleado
class Profesor extends Empleado{
    int sueldo;
    public void mostrar2(){
        super.mostrarDatos();//Metodo heredado de empleado
        JOptionPane.showMessageDialog(null, sueldo);
    }
    public void ingreso2(){
        super.ingresarDatos(); //Metodo heredado de empleado
        String s = JOptionPane.showInputDialog(null, "Ingrese el sueldo");
        this.sueldo = Integer.parseInt(s);
    }
}
