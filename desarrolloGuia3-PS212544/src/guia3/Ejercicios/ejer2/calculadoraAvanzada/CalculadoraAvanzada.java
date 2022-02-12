package guia3.Ejercicios.ejer2.calculadoraAvanzada;

import guia3.Ejercicios.ejer2.calculadoraBasica.CalculadoraBasica;
public class CalculadoraAvanzada extends CalculadoraBasica {

    public CalculadoraAvanzada(){
        super.setNumero1(0);
        super.setNumero2(0);
    }

    public double potenciaNumeros(double num1, double num2){
        double resultado;
        resultado = Math.pow(super.setNumero1(num1), super.setNumero2(num2));
        return resultado;
    }

    public double factorialNumeros(double num1, double num2) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        double resultado = 0;
        try{
            if(num1 > 0 && num2 > 0){
                if(num1 > num2){
                    resultado = super.setNumero1(num1);
                    for(double i = num1 -1 ; i >= num2; i--){
                         resultado = resultado * i;
                    }
                }else{
                    resultado = super.setNumero2(num2);
                    for(double i = num2 - 1 ; i>= num1; i--){
                        resultado = resultado * i;
                    }
                }
            }
            return resultado;
        }catch(ArithmeticException e){
            throw new ArithmeticException("No se puede realizar factorial con numeros negativos" + e.getMessage());
        }
    }

    public double opuestoNumero1(double num1) {
        double resultado;
        if(num1 < 0)
            resultado = Math.abs(num1);
        else
            resultado = num1 * (-1);

        return resultado;
    }

    public double opuestoNumero2(double num2){
        double resultado;
        if(num2 < 0)
            resultado = Math.abs(num2);
        else
            resultado = num2 * (-1);
        return resultado;
    }

    public String opuestosNumeros(double num1, double num2){
        String resultado;
        resultado = "Opuesto de numero 1: " +opuestoNumero1(super.setNumero1(num1)) + "\n Opuesto de numero 2: " + opuestoNumero2(super.setNumero2(num2));
        return resultado;
    }
}