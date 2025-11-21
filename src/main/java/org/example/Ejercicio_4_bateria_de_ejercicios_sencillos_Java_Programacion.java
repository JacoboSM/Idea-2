package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_4_bateria_de_ejercicios_sencillos_Java_Programacion {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        boolean control = true;

        do {
            try {
                System.out.println("Dime el primer numero");
                num1 = read.nextDouble();
                System.out.println("Dime el segundo numero");
                num2 = read.nextDouble();
                System.out.println("Dime el tercer numero");
                num3 = read.nextDouble();
                control = false;
            } catch (InputMismatchException e) {
                System.out.println("Introduce solo numeros por favor");
                read.nextLine();
            }
        } while (control);

        if (num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("ERROR: hay números introducidos que son iguales ");
        } else if (num1 < num2 && num1 < num3 ) {

            System.out.println("El numero mas pequeño es " + num1);

        } else if (num2 < num1 && num2 < num3) {

            System.out.println("El numero mas pequeño es " + num2);

        }else {
            System.out.println("El numero mas pequeño es " + num3);
        }


    }
}
