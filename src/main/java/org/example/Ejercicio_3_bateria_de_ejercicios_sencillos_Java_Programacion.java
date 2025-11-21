package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_3_bateria_de_ejercicios_sencillos_Java_Programacion {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

        double num = 0;
        boolean control = true;

        do {

            try{

                System.out.println("¿Dime un numero? ");
                num = read.nextDouble();
                control = false;

            } catch (InputMismatchException e) {

                System.out.println("Introduce solo numeros por favor");
                read.nextLine();
            }

        } while (control);

        if (num == 0 ){
            
            System.out.println(num + " es un numero natural");
            
        } else if (num > 0) {

            System.out.println(num + " es un numero negativo");
            
        }else{

            System.out.println(num + " es un numero positivo");
        }
    }

}