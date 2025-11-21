package org.example;

import java.util.Scanner;

public class Tema_2_Preexamen_Ejercicio_2 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        int numero;

        System.out.print("Introduce un número entero: ");
        while (!read.hasNextInt()) {
            System.out.println("Solo se permiten enteros");
            read.next();
            System.out.print("Introduce un número entero: ");
        }

        numero = read.nextInt();
        System.out.println("Número introducido: " + numero);

    }

}
