package org.example;

import java.util.Scanner;

public class Tema_2_Strings_bateria_1_Ejercicio_1 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una palabra o frase");
        String linea = read.nextLine();

        System.out.println("Texto original:" + linea);

        int tamayo = linea.length();

        System.out.println("La longitud del texto es :" + tamayo);

        System.out.println("Texto sin espacios " + linea.trim());

        int mitad1 = tamayo / 2;

        int mitad2 = mitad1 + 1;

        String trozo1 = linea.substring(0,mitad1);

        String trozo2 = linea.substring(mitad2,tamayo);

        System.out.println("Texto dividido en dos mitades : " + "Primera mitad del texto es " + trozo1 + " 'y la segunda mitad del texto es' " + trozo2);

        String linea_mayusculas = linea.toUpperCase();

        System.out.println("Texto a mayúsculas : " + linea_mayusculas);

    }
}

