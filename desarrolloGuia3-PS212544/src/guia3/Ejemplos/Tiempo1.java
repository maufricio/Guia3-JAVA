package guia3.Ejemplos;

import java.lang.module.Configuration;
import java.text.DecimalFormat;
public class Tiempo1 extends Object {

    private int hora; // 0 - 23 solo se declara para ser tratado en los metodos
    private int minutos; // 0 - 59 solo se declara para ser tratado en los metodos
    private int segundos; // 0 - 59 solo se declara para ser tratado en los metodos

    public Tiempo1(){
        establecerHora(0,0,0);
    }

    public void establecerHora(int hora, int minutos, int segundos){//de tipo void porque se establecen valores
        this.hora = ((hora >= 0 && hora < 24) ? hora : 0);//Se lee: hora mayor o igual a 0 y menor a 24 entonces igual a la hora, sino igual a 0
        this.minutos = ((minutos >= 0 && minutos < 60) ? minutos : 0);//Se lee: minuto mayor o igual a 0 y menor a 60 entonces igual a minutos, sino igual a 0
        this.segundos = ((segundos >= 0 && segundos < 60) ? segundos : 0); //Se lee: segundo mayor o igual a 0 y menor a 60 entonces igual a segundo, sino igual a 0
    }

    //convertir a formato de hora universal, es decir que cuando llegue a cero la hora no importa, porque es como que fuera las doce
    public String aStringUniversal(){
        DecimalFormat dosDigitos  = new DecimalFormat("00");
        return dosDigitos.format(this.hora) + " : " + dosDigitos.format(this.minutos) + " : " + dosDigitos.format(this.segundos);
    }
    //convertir a formato de hora estandar, es decir que cuando llegue a 0 será igual a 12 como en los relojes tradicionales
    public String aStringEstandar(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        return ((this.hora == 0 || this.hora == 12) ? 12 : this.hora % 12) + " : " + dosDigitos.format(this.minutos) + " : " + dosDigitos.format(this.segundos) + (hora  < 12 ? "AM" : "PM");
    }
}