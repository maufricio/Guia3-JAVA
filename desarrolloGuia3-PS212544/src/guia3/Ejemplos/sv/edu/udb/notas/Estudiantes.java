package guia3.Ejemplos.sv.edu.udb.notas;

public class Estudiantes {
    String nombre, apellido;
    private double nota1, nota2, nota3;

    //Constructor
    Estudiantes(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //Definicion de Setters y Getters
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(){
        this.apellido = apellido;
    }
    public double getNota1(){
        return this.nota1;
    }
    public void setNota1(double nota1){
        //Nota Validada
        if(nota1 >= 0 && nota1 <= 10){
            this.nota1 = nota1;
        }else{
            this.nota1 = 0;
            System.out.println("Nota no valida! (" + nota1 + ")");
        }
    }

    public double getNota2(){
        return this.nota2;
    }
    public void setNota2(double nota2){
        //Nota validada
        if(nota2 >= 0 && nota2 <= 10){
            this.nota2 = nota2;
        }else{
            this.nota2 = 0;
            System.out.println("Nota no valida! (" + nota2 +")");
        }
    }

    public double getNota3(){
        return this.nota3;
    }
    public void setNota3(double nota3){
        //Nota Validada
        if(nota3 >= 0 && nota3 <= 10){
            this.nota3 = nota3;
        }else{
            this.nota3 = 0;
            System.out.println("Nota no valida! (" + nota3 + ")");
        }
    }
}