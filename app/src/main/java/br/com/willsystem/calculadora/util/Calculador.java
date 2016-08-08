package br.com.willsystem.calculadora.util;

/**
 * Created by will on 08/08/16.
 */
public class Calculador {

    public Double soma(String n1, String n2){
        Double soma;
        soma = Double.parseDouble(n1) + Double.parseDouble(n2);
        return soma;
    }
    public Double subtracao(String n1, String n2){
        Double resultado;
        resultado = Double.parseDouble(n1) - Double.parseDouble(n2);
        return resultado;
    }
    public Double multiplicacao(String n1, String n2){
        Double resultado;
        resultado = Double.parseDouble(n1) * Double.parseDouble(n2);
        return resultado;
    }
    public Double divisao(String n1, String n2){
        Double resultado;
        resultado = Double.parseDouble(n1) / Double.parseDouble(n2);
        return resultado;
    }
    public Double raizQuadrada(String n1){
        Double resultado;
        resultado = Math.sqrt(Double.parseDouble(n1));
        return resultado;
    }
    public Double seno(String n1){
        Double resutado;
        resutado = Math.sin(Double.parseDouble(n1));
        return  resutado;
    }
    public Double cos(String n1){
        Double resutado;
        resutado = Math.cos(Double.parseDouble(n1));
        return  resutado;
    }
}
