package com.openboot;

public class Examples {

    /*
    Aqui voy a escribir los tipos de datos primitivos y asi imprimirlos en pantalla
     */

    public static void main(String[] args) {

       //Numericos enteros
        byte dato = 1;
        short dato2 = 2;
        int dato3 = 3;
        long dato4 = 4;

        System.out.println(dato);
        System.out.println(dato2);
        System.out.println(dato3);
        System.out.println(dato4);

        //Numericos decimales
        float dato5 = 1.0f;
        double dato6 = 1.7;

        System.out.println(dato5);
        System.out.println(dato6);

        //Booleanos (true y false)
        boolean dato7 = true;
        boolean dato8 = false;

        System.out.println(dato7);
        System.out.println(dato8);
        //Textos
        char dato9 = 'a';
        String dato10 ="Aqui se escribe un texto grande";

        System.out.println(dato9);
        System.out.println(dato10);
    }

}
