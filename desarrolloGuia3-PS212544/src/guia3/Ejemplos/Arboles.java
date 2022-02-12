package guia3.Ejemplos;

public class Arboles {
    //Constructor sin parametros
    public Arboles(){
        System.out.println("Un arbol generico");
    }

    //Constructors con un parametro string
    public Arboles(String tipo){
        System.out.println("Un arbol tipo: " + tipo);
    }

    //Constructor con un parametro int
    public Arboles(int altura){
        System.out.println("Un arbol de " + altura + " metros.");
    }
    //Constructor con dos parametros uno int y el otro String
    public Arboles(int altura, String tipo){
        System.out.println("Un " + tipo + " de " + altura + " metros");
    }

    public static void main(String[] args) {
        Arboles arbol1 = new Arboles(4);//Objeto1
        Arboles arbol2 = new Arboles("Robles");//Objeto2
        Arboles arbol3 = new Arboles(); //Objeto3
        Arboles arbol4 = new Arboles(5, "Pino");
    }
}
