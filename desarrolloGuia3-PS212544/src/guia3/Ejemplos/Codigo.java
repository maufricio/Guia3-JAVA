package guia3.Ejemplos;

class Clase{
    static int contador;
    Clase(){this.contador++;}
    int getContador(){//Obtener el valor del contador
        return this.contador;
    }
}

public class Codigo {
    public static void main(String[] args) {
        Clase uno = new Clase();
        Clase dos = new Clase();
        Clase tres = new Clase();
        Clase cuatro = new Clase();
        System.out.println("Hemos declarado " + dos.getContador() + " objetos.");
    }
}
