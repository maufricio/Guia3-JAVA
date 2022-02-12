package guia3.Ejercicios.ejer1;

public class PruebaAlumno {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();

        System.out.println(alumno.getInfoAlumno());

        alumno.setInformacion();
        System.out.println(alumno.getInfoAlumno());

        alumno.setMaterias();
        System.out.println(alumno.getInfoMaterias());

        alumno.setTodaInformacion();
        System.out.println(alumno.getTodaInfo());

        System.exit(0);
    }
}
