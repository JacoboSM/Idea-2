package org.example;

import java.util.Scanner;

public class Tema_2_Strings_bateria_1_Ejercicio_4 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        System.out.println("Dime una frase :");
        String frase = read.nextLine();

        System.out.println("¿Que palabra quieres contar?");
        String palabra = read.nextLine();

        int frase_tamayo = frase.length();
        int palabra_tamayo = palabra.length();

        String frase_sin = frase.replace(palabra,"");
        int conteo = frase_sin.length(); // Ponemos en una variable lo que mide la frase sin la palabra
        int operacion = frase_tamayo - conteo;
        int resultado = operacion / palabra_tamayo;
        System.out.println(resultado);

    }
}
