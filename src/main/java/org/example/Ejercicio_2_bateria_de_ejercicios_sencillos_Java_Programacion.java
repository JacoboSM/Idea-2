package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_2_bateria_de_ejercicios_sencillos_Java_Programacion {
    public static void main (String[] args) {

        final double JORNADA = 40;
        final double PLUS_EXTRA = 1.5;

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
                System.out.println("Introduce solo numeros por favor");
                read.nextLine();
            }

        } while (control);

        if (horas > JORNADA){

            double extra = horas - JORNADA;

            double coste = precio * PLUS_EXTRA;

            double resultado = (horas * precio) + (extra * coste);
            System.out.println("Salario (con extra) : " + resultado + "$");

        }else{

            double resultado = (horas * precio);
            System.out.println("Salario: " + resultado + "$");

        }

    }
}

