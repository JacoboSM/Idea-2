package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_1_bateria_de_ejercicios_sencillos_Java_Programacion {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

        double horas = 0;
        double precio = 0;
        boolean control = true;

        do {

            try {
                System.out.println("¿Que horas trabajas? ");
                horas = read.nextDouble();
                System.out.println("¿Cuanto cobras por hora? ");
                precio = read.nextDouble();
                control = false;
            } catch (InputMismatchException e) {
                System.out.println("Introduce solo numeros por favor. Vuelve a introducirlos");
                read.nextLine();
            }

        } while (control);

        double resultado = horas * precio;
        System.out.println("Salario: " + resultado);

    }

}
