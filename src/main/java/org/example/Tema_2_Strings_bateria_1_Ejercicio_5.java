package org.example;

import java.util.Scanner;

public class Tema_2_Strings_bateria_1_Ejercicio_5 {

    static public void main (String[] args){

        Scanner read = new Scanner(System.in);

        int contador = 10;

        System.out.println("Jugador 1! Introduce tu frase : ");
        String frase = read.nextLine();



        do {

            System.out.println("Jugador 2! Introduce tu palabra : ");
            String palabra = read.nextLine();

            boolean comprobar = frase.contains(palabra);

            if (comprobar){

                System.out.println("Enhorabuena, has acertado una palabra!");
                break;

            }

            contador = contador - 1;

            System.out.println("Has fallado te quedan " + contador + " intentos");

        } while (contador >= 1 );

    }
}
