package org.example;

import java.util.Scanner;

public class Tema_2_Strings_bateria_1_Ejercicio_3 {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Inserta el número...");
        int numero = read.nextInt();

        System.out.println("¿Cuántas cifras quieres eliminar?");
        int quitar = read.nextInt();

        String numero_string = Integer.toString(numero);
        int tamayo = numero_string.length();
        int nuevo_tamayo = tamayo - quitar;

        String resultado = numero_string.substring(0,nuevo_tamayo);
        System.out.println("El resultado es " + resultado);

    }

}
