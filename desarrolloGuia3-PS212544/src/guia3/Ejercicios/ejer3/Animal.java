package guia3.Ejercicios.ejer3;

import javax.swing.*;
import java.util.*;
public class Animal {
    private String nombreAnimal, edadAnimal, alimentoAnimal;
    public Animal(){
        this.nombreAnimal = "ninguno";
        this.edadAnimal = "ninguno";
        this.alimentoAnimal ="ninguno";
    }

    public String getNombreAnimal() {
        return this.nombreAnimal;
    }

    public void setNombreAnimal() {
        String nombre_animal;
        nombre_animal = JOptionPane.showInputDialog(null, "Ingrese el nombre del animal");
        this.nombreAnimal = nombre_animal;
    }

    public String getEdadAnimal() {
        return this.edadAnimal;
    }

    public void setEdadAnimal() {
        String edad_animal;
        edad_animal = JOptionPane.showInputDialog(null, "Ingrese la edad del animal");
        this.edadAnimal = edad_animal;
    }

    public String getAlimentoAnimal() {
        return this.alimentoAnimal;
    }

    public void setAlimentoAnimal() {
        String alimento_animal;
        alimento_animal = JOptionPane.showInputDialog(null, "Ingrese el alimento del animal");
        this.alimentoAnimal = alimento_animal;
    }

    public static void main(String[] args) {
        Gallo gallo = new Gallo();
        Perro perro = new Perro();
        Gato gato = new Gato();
        Hamster hamster = new Hamster();

        gallo.setNombreAnimal();
        gallo.setEdadAnimal();
        gallo.setAlimentoAnimal();
        gallo.setColor_plumas();

        perro.setNombreAnimal();
        perro.setEdadAnimal();
        perro.setAlimentoAnimal();
        perro.setColor_pelaje();

        gato.setNombreAnimal();
        gato.setEdadAnimal();
        gato.setAlimentoAnimal();
        gato.setColor_ojos();

        hamster.setNombreAnimal();
        hamster.setEdadAnimal();
        hamster.setAlimentoAnimal();
        hamster.setCantidad_pulgas();

        System.out.println("Animal: Gallo");
        System.out.println(gallo.getNombreAnimal());
        System.out.println(gallo.getEdadAnimal());
        System.out.println(gallo.getAlimentoAnimal());
        System.out.println(gallo.getColor_plumas());
        System.out.println("Animal: Perro");
        System.out.println(perro.getNombreAnimal());
        System.out.println(perro.getEdadAnimal());
        System.out.println(perro.getAlimentoAnimal());
        System.out.println(perro.getColor_pelaje());
        System.out.println("Animal: Gato");
        System.out.println(gato.getNombreAnimal());
        System.out.println(gato.getEdadAnimal());
        System.out.println(gato.getAlimentoAnimal());
        System.out.println(gato.getColor_ojos());
        System.out.println("Animal: Hamster");
        System.out.println(hamster.getNombreAnimal());
        System.out.println(hamster.getEdadAnimal());
        System.out.println(hamster.getAlimentoAnimal());
        System.out.println(hamster.getCantidad_pulgas());
    }
}

class Gallo extends Animal{
    private String color_plumas;
    public Gallo(){
        this.color_plumas ="ninguno";
    }
    public void setColor_plumas(){
        String color_plumas;
        color_plumas = JOptionPane.showInputDialog(null, "Ingrese el color de plumas de" + super.getNombreAnimal());
        this.color_plumas = color_plumas;
    }
    public String getColor_plumas() {
        return this.color_plumas;
    }
}
class Perro extends Animal{
    private String color_pelaje;
    public Perro(){
        this.color_pelaje ="ninguno";
    }
    public void setColor_pelaje(){
        String color_pelaje;
        color_pelaje = JOptionPane.showInputDialog(null, "Ingrese el color de pelaje de" + super.getNombreAnimal());
        this.color_pelaje = color_pelaje;
    }
    public String getColor_pelaje(){
        return this.color_pelaje;
    }
}
class Gato extends Animal{
    private String color_ojos;
    public Gato(){
        this.color_ojos ="ninguno";
    }
    public void setColor_ojos(){
        String color_ojos;
        color_ojos = JOptionPane.showInputDialog(null, "Ingrese el color de ojos de" + super.getNombreAnimal());
        this.color_ojos = color_ojos;
    }
    public String getColor_ojos(){
        return this.color_ojos;
    }
}
class Hamster extends Animal{
    private String cantidad_pulgas;
    public Hamster(){
        this.cantidad_pulgas ="ninguno";
    }
    public void setCantidad_pulgas(){
        String color_ojos;
        color_ojos = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pulgas de" + super.getNombreAnimal());
        this.cantidad_pulgas = cantidad_pulgas;
    }
    public String getCantidad_pulgas(){
        return this.cantidad_pulgas;
    }
}
