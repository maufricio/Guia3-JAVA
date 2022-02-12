package guia3.Ejercicios.ejer2.calculadoraBasica;

public class CalculadoraBasica {
    private double numero1, numero2;

    public CalculadoraBasica(){
        this.numero1 = 0;
        this.numero2 = 0;
    }

    //Setters
    public double setNumero1(double numero1) {
        this.numero1 = numero1;
        return this.numero1;
    }
    public double setNumero2(double numero2) {
        this.numero2 = numero2;
        return this.numero2;
    }

    //Funciones aritmeticas basicas
    public double sumaNumeros(double num1, double num2) {
        double resultado = setNumero1(num1) + setNumero2(num2);
        return resultado;
    }

    public double restaNumeros(double num1, double num2){
        double resultado;
        if(num1 < num2){
            resultado = setNumero2(num2) - setNumero1(num1);
        }else{
            resultado = setNumero1(num1) - setNumero2(num2);
        }
        return resultado;
    }

    public double multiplicacionNumeros(double num1, double num2){
        double resultado = setNumero1(num1) * setNumero2(num2);
        return resultado;
    }

    public double divisionNumeros(double num1, double num2) throws ArithmeticException{
        double resultado;
        try{
            resultado = setNumero1(num1) / setNumero2(num2);
        }catch(ArithmeticException e){
            throw new ArithmeticException("No se puede realizar la operacion, debido a division entre cero: " + e.getMessage());
        }
        return resultado;
    }
}