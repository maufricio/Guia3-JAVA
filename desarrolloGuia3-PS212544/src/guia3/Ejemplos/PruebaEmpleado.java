package guia3.Ejemplos;
import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        Profesor prf = new Profesor();

        //Para clase empleado
        JOptionPane.showMessageDialog(null, "clase empleado");
        emp.ingresarDatos();
        emp.mostrarDatos();

        //Para clase profesor
        JOptionPane.showMessageDialog(null, "clase profesor");
        prf.ingreso2();
        prf.mostrar2();
    }
}
