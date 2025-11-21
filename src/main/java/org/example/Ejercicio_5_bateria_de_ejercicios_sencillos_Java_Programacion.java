package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_5_bateria_de_ejercicios_sencillos_Java_Programacion {
    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

        double num1 = 0;
        double num2 =0;
        boolean control = true;

        do {

            try {
                System.out.println("Dime el primer numero");
                num1 = read.nextDouble();
                System.out.println("Dime el segundo numero");
                num2 = read.nextDouble();
                control = false;
            } catch (InputMismatchException e) {
                System.out.println("Introduce solo numeros por favor. Vuelve a introducirlos");
                read.nextLine();
            }

        } while (control);

        if (num2 == 0){

            System.out.println("ERROR: no se puede dividir entre 0 ");

        }else {

            double resultado = num1 / num2;
            System.out.println("El resultado de la división es " + resultado);

        }

    }
}