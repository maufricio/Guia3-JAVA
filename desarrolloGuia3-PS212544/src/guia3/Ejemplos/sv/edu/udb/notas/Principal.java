package guia3.Ejemplos.sv.edu.udb.notas;

public class Principal {
    public static void main(String[] args) {
        Estudiantes estudiante = new Estudiantes("Mauricio", "Perez");
        estudiante.setNota1(10);
        estudiante.setNota2(15);
        estudiante.setNota3(10);

        System.out.println("Notas de " + estudiante.nombre + " " + estudiante.getApellido());

        System.out.println("Nota 1: " + estudiante.getNota1());
        System.out.println("Nota 2: " + estudiante.getNota2());
        System.out.println("Nota 3: " + estudiante.getNota3());
    }
}