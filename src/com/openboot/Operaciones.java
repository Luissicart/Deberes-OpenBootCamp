package com.openboot;

public class Operaciones {

    public static void main(String[] args) {

       double resultado = obtenerIVA(500,0.21);
       double resultado1 = sumarIVA(500 + resultado);
        System.out.println(resultado1);

    }

    static double obtenerIVA(int a, double b){
    return a * b;

    }

    static double sumarIVA(double resultado){
        return resultado;

    }

}
