package guia3.Ejercicios.ejer1;

import javax.swing.JOptionPane;

public class Alumno {
    private String nombre, apellido, carne;
    private String materia1, materia2, materia3, materia4, materia5;
    public Alumno(){
        this.nombre = "Mauricio";
        this.apellido = "Pérez";
        this.carne = "PS212544";
    }



    //Getters
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public String getCarne() {
        return this.carne;
    }
    public String getMateria1() {
        return materia1;
    }
    public String getMateria2() {
        return materia2;
    }
    public String getMateria3() {
        return materia3;
    }
    public String getMateria4() {
        return materia4;
    }
    public String getMateria5() {
        return materia5;
    }

    public void setInformacion(){
        this.nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre: ");
        this.apellido = JOptionPane.showInputDialog(null, "Ingresa tu apellido: ");
        this.carne = JOptionPane.showInputDialog(null, "Ingresa tu código de carnet: ");
    }


    public void setMaterias(){
        this.materia1 = JOptionPane.showInputDialog(null, "Ingrese el nombre de la primer materia que usted cursa: ");
        this.materia2 = JOptionPane.showInputDialog(null, "Ingresse el nombre de la segunda materia que usted cursa: ");
        this.materia3 = JOptionPane.showInputDialog(null, "Ingresse el nombre de la tercer materia que usted cursa: ");
        this.materia4 = JOptionPane.showInputDialog(null, "Ingresse el nombre de la cuarta materia que usted cursa: ");
        this.materia5 = JOptionPane.showInputDialog(null, "Ingresse el nombre de la quinta materia que usted cursa: ");
    }


    public void setTodaInformacion(){
        this.nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        this.apellido = JOptionPane.showInputDialog(null, "Ingrese su apellido: ");
        this.carne = JOptionPane.showInputDialog(null, "Ingrese el código de carnet: ");

        this.materia1 = JOptionPane.showInputDialog(null, "Ingrese el nombre de la primer materia: ");
        this.materia2 = JOptionPane.showInputDialog(null, "Ingrese el nombre de la segunda materia: ");
        this.materia3 = JOptionPane.showInputDialog(null, "Ingrese el nombre de la tercer materia: ");
        this.materia4 = JOptionPane.showInputDialog(null, "Ingrese el nombre de la cuarta materia: ");
        this.materia5 = JOptionPane.showInputDialog(null, "Ingrese el nombre de la quinta materia: ");
    }


    //Informacion empaquetada
    public String getInfoMaterias(){
        return getMateria1() + ", " + getMateria2() +", "+ getMateria3() + ", " + getMateria4() +", " + getMateria5();
    }
    public String getTodaInfo(){
        return getInfoAlumno() + " cursa las materias " + getMateria1() + ", " + getMateria2() +", "+ getMateria3() + ", " + getMateria4() +", " + getMateria5();
    }
    public String getInfoAlumno(){
        return getNombre() +" "+ getApellido() + " " + getCarne();
    }
}
